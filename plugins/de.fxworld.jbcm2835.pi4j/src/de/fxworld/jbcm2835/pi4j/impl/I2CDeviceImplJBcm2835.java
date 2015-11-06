/*
 * COPYRIGHT_START
 * 
 * jBCM2835 is a Java Wrapper for the BCM2835 C library from Mike McCauley.
 * Copyright (C) 2015 Pascal Weyprecht
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * COPYRIGHT_END
 *
 * Contributors:
 *    Pascal Weyprecht - initial API and implementation
 */
package de.fxworld.jbcm2835.pi4j.impl;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.pi4j.io.i2c.I2CDevice;

import de.fxworld.jbcm2835.JBcm2835Library;

public class I2CDeviceImplJBcm2835 implements I2CDevice {

	protected byte deviceAddress = 0;
	
	public I2CDeviceImplJBcm2835(byte address) {
		this.deviceAddress = address;
	}

	@Override
	public void write(byte b) throws IOException {
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);		
		JBcm2835Library.bcm2835_i2c_write(new String(new byte[] {b}), 1);
	}

	@Override
	public void write(byte[] buffer, int offset, int size) throws IOException {
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);		
		JBcm2835Library.bcm2835_i2c_write(new String(buffer, offset, size), size);
	}

	@Override
	public void write(int address, byte b) throws IOException {
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);		
		JBcm2835Library.bcm2835_i2c_write(new String(new byte[] {(byte) address, b}), 2);
	}

	@Override
	public void write(int address, byte[] buffer, int offset, int size) throws IOException {
		byte[] data = new byte[buffer.length + 1];		
		
		data[0] = (byte) address;
		System.arraycopy(buffer, offset, data, 1, size);
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);		
		JBcm2835Library.bcm2835_i2c_write(new String(data), size + 1);
	}

	@Override
	public int read() throws IOException {
		ByteBuffer data   = ByteBuffer.allocate(1);
		int        result = 0;
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);
		JBcm2835Library.bcm2835_i2c_read(data, 1);
		
		data.position(0);
		result = data.get();
		
		return result;
	}

	@Override
	public int read(byte[] buffer, int offset, int size) throws IOException {
		ByteBuffer data   = ByteBuffer.allocate(size);
		int        result = 0;
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);
		result = JBcm2835Library.bcm2835_i2c_read(data, size);
		
		data.position(0);
		data.get(buffer, offset, size);
		
		return result;
	}

	@Override
	public int read(int address) throws IOException {
		ByteBuffer data     = ByteBuffer.allocate(1);
		ByteBuffer register = ByteBuffer.allocate(1);
		int        result = 0;
		
		register.put((byte) address);
		register.flip();
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);
		JBcm2835Library.bcm2835_i2c_read_register_rs(register, data, 1);
		
		data.position(0);
		result = data.get();
		
		return result;
	}

	@Override
	public int read(int address, byte[] buffer, int offset, int size) throws IOException {
		ByteBuffer data     = ByteBuffer.allocate(size);
		ByteBuffer register = ByteBuffer.allocate(1);
		int        result = 0;
		
		register.put((byte) address);
		register.flip();
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);
		result = JBcm2835Library.bcm2835_i2c_read_register_rs(register, data, size);
		
		data.position(0);
		data.get(buffer, offset, size);
		
		return result;
	}

	@Override
	public int read(byte[] writeBuffer, int writeOffset, int writeSize, byte[] readBuffer, int readOffset, int readSize) throws IOException {
		ByteBuffer cmds   = ByteBuffer.allocate(writeSize);
		ByteBuffer data   = ByteBuffer.allocate(readSize);
		int        result = 0;
		
		cmds.put(writeBuffer, writeOffset, writeSize);
		cmds.flip();
		
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(deviceAddress);
		JBcm2835Library.bcm2835_i2c_write_read_rs(cmds, writeSize, data, readSize);
		
		data.position(0);
		data.get(readBuffer, readOffset, readSize);
		
		return result;
	}

}
