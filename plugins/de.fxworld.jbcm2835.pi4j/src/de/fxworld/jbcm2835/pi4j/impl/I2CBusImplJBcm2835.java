/*
 * COPYRIGHT_START
 *
 * Copyright (c) 2015 Pascal Weyprecht and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991 which accompanies this distribution, and is 
 * available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
 *
 * COPYRIGHT_END
 *
 * Contributors:
 *    Pascal Weyprecht - initial API and implementation
 */
package de.fxworld.jbcm2835.pi4j.impl;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;

import de.fxworld.jbcm2835.I2CClockDivider;
import de.fxworld.jbcm2835.JBcm2835Library;

public class I2CBusImplJBcm2835 implements I2CBus {

	private static volatile I2CBusImplJBcm2835 bus = null;
	
	public I2CBusImplJBcm2835(int busNumber, int baudrate, I2CClockDivider i2cClockDivider) {
		JBcm2835Library.init();
		
		// Close I2C peripheral to reconfigure it
		JBcm2835Library.bcm2835_i2c_end();
		
		JBcm2835Library.bcm2835_i2c_begin();
		JBcm2835Library.bcm2835_i2c_set_baudrate(baudrate);	
		JBcm2835Library.bcm2835_i2c_setClockDivider(i2cClockDivider);		
	}

	@Override
	public I2CDevice getDevice(int address) throws IOException {		
		return new I2CDeviceImplJBcm2835((byte) address);
	}

	@Override
	public String getFileName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getFileDescriptor() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void close() throws IOException {
		synchronized (I2CBusImplJBcm2835.class) {
			JBcm2835Library.bcm2835_i2c_end();
			//JBcm2835Library.close();
		}
	}

	public static I2CBus getBus(int busNumber) {
		if (bus == null) {
			synchronized (I2CBusImplJBcm2835.class) {
				bus = new I2CBusImplJBcm2835(busNumber, 100000, I2CClockDivider.I2C_CLOCK_DIVIDER_2500);
			}
		}
		
		return bus;
	}

}
