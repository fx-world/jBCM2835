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
 *    D.Qendri - initial C file from Sensorian
 *    Pascal Weyprecht - conversion to java
 */
package de.fxworld.jbcm2835.tests;

import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;

import org.junit.Test;

import de.fxworld.jbcm2835.I2CClockDivider;
import de.fxworld.jbcm2835.JBcm2835Library;

public class SensorianI2CTemperatureTest {

	private static final byte MPL3115A2_ADDRESS = 0x60;
	
	private static final int WHO_AM_I    = 0x0C;
	private static final int CTRL_REG1   = 0x26;	
	private static final int OUT_T_MSB   = 0x04;
	private static final int PT_DATA_CFG = 0x13;
	
	private static final int SBYB = 0x01;
	
	private static final int DREM  = 0x04;
	private static final int PDEFE = 0x02;
	private static final int TDEFE = 0x01;

	public static final int OS2     = 0x20;
	public static final int OS1     = 0x10;
	public static final int OS0     = 0x08;
	
	// Oversample Ratio 1
	public static final byte OS_1    = 0x00;                                     //  6 ms min between samples
	public static final byte OS_2    = OS0;                                      //  10 ms
	public static final byte OS_4    = OS1;                                      //  18 ms
	public static final byte OS_8    = OS1 | OS0;                                //  34 ms
	public static final byte OS_16   = OS2;                                      //  66 ms
	public static final byte OS_32   = OS2 | OS0;                                // 130 ms
	public static final byte OS_64   = OS2 | OS1;                                // 258 ms
	public static final byte OS_128  = OS2 | OS1 | OS0;                          // 512 ms

	public static void main(String[] args) {
		SensorianI2CTemperatureTest test = new SensorianI2CTemperatureTest();
		test.test();
	}

	@Test
	public void test() {
		System.out.println("MPL3115A2 Temperature test.");

		I2C_Initialize(MPL3115A2_ADDRESS);			//Initialize I2C peripheral
		MPL3115A2_Initialize();		//Initialize the sensor
		MPL3115A2_ActiveMode();		//Configure the sensor for active mode

		int id  = MPL3115A2_ID();	//Verify chip id
		System.out.println("Chip ID: 0x" + Integer.toHexString(id));

	    for (int i = 0; i < 10; i++) {
			float temp = MPL3115A2_ReadTemperature();//Take a temperature reading
			System.out.println("Temperature : " + temp + " degree Celsius.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
	    }
	}

	private float MPL3115A2_ReadTemperature() {
		byte[] temperature = new byte[2];

		MPL3115A2_ReadByteArray(OUT_T_MSB, temperature, 2);		

		int   temptemp = temperature[0] & 0x00ff;
		int   temptemp2 = temperature[1] & 0x00ff;
		float templsb  = (temptemp2 >>> 4) / 16.0f; 			//temp, fraction of a degree
	    float unpacked = temptemp + templsb;

		return unpacked;
	}

	protected int MPL3115A2_ID() {
		int id = MPL3115A2_ReadByte(WHO_AM_I) & 0x00ff;
		return id;
	}

	protected void MPL3115A2_ActiveMode() {
		int tempSetting = MPL3115A2_ReadByte(CTRL_REG1) & 0x00ff;    //Read current settings
		tempSetting |= SBYB;                                    //Set SBYB bit for Active mode
		MPL3115A2_WriteByte(CTRL_REG1, tempSetting);
	}

	protected void MPL3115A2_Initialize() {
		MPL3115A2_StandbyMode();
		MPL3115A2_WriteByte(PT_DATA_CFG, DREM | PDEFE | TDEFE);		//Enable data ready flags for pressure and temperature )
		MPL3115A2_WriteByte(CTRL_REG1, OS_128 | SBYB);
	}

	private void MPL3115A2_StandbyMode() {
		int ctrl_reg = MPL3115A2_ReadByte(CTRL_REG1) & 0x00ff; //Read current settings
		ctrl_reg &= ~SBYB;                                      //Clear SBYB bit for Standby mode
		MPL3115A2_WriteByte(CTRL_REG1, ctrl_reg);               //Put device in Standby mode

	}

	protected void I2C_Initialize(byte address) {
		assertEquals("libray error", 1, JBcm2835Library.init());
		JBcm2835Library.bcm2835_i2c_end();		//Close I2C peripheral to reconfigure it

		JBcm2835Library.bcm2835_i2c_begin();						//Set pins as I2C
		JBcm2835Library.bcm2835_i2c_set_baudrate(100000);			//Set I2C baudrate
		JBcm2835Library.bcm2835_i2c_setClockDivider(I2CClockDivider.I2C_CLOCK_DIVIDER_2500);		//100 Khz
		JBcm2835Library.bcm2835_i2c_setSlaveAddress(address);	//Set device address

	}

	protected void MPL3115A2_WriteByte(int reg, int value) {
		I2C_WriteByteRegister(reg,value);			//Write value to register
	}

	protected byte MPL3115A2_ReadByte(int reg) {
	    return I2C_ReadByteRegister(reg);		//Read register current value
	}

	protected void MPL3115A2_ReadByteArray(int reg, byte[] buffer, int length) {
		I2C_ReadByteArray(reg, buffer, length);
	}

	protected void I2C_WriteByteRegister(int reg, int value) {
		JBcm2835Library.bcm2835_i2c_write(new String(new byte[] {(byte) reg, (byte) value}), 2);
	}

	protected byte I2C_ReadByteRegister(int reg) {
		ByteBuffer data     = ByteBuffer.allocate(1);
		ByteBuffer register = ByteBuffer.allocate(1);
		byte       result   = 0;

		register.put((byte) reg);
		register.flip();

		JBcm2835Library.bcm2835_i2c_read_register_rs(register, data, 1);

		data.position(0);
		result = data.get();

		return result;
	}

	protected void I2C_ReadByteArray(int reg, byte[] buffer, int length) {
		ByteBuffer data     = ByteBuffer.allocate(length);
		ByteBuffer register = ByteBuffer.allocate(1);

		register.put((byte) reg);
		register.flip();

		JBcm2835Library.bcm2835_i2c_read_register_rs(register, data, length);

		data.position(0);
		data.get(buffer, 0, length);
	}
}
