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

import org.junit.Test;

import de.fxworld.jbcm2835.FunctionSelect;
import de.fxworld.jbcm2835.JBcm2835Library;
import de.fxworld.jbcm2835.RPiGPIOPin;
import de.fxworld.jbcm2835.SPIBitOrder;
import de.fxworld.jbcm2835.SPIChipSelect;
import de.fxworld.jbcm2835.SPIClockDivider;
import de.fxworld.jbcm2835.SPIMode;

public class SensorianSpiRegistersTest {
	
	private static final byte STAT_REG1 = 0x05;
	private static final byte STAT_REG2 = 0x35;
	private static final byte STAT_REG3 = 0x33;
	private static final byte JEDEC     = (byte) 0x9F;
	private static final byte CMD_RDID  = 0;
	private static final byte CMD_WREN  = 0;
	private static final byte CMD_WRSR  = 0;

	public static void main(String[] args) {
		SensorianSpiRegistersTest test = new SensorianSpiRegistersTest();
		test.test();
	}

	@Test
	public void test() {					
		SPI_Initialize();								//Initialize SPI peripheral
		S25FL_Setup();                                  //Setup flash memory
		S25FL_SReg_Write((byte) 0x00);                         //Remove protection from all blocks writes to SR1

		System.out.println("NOR Flash memory demo.\r\n");
		System.out.println("This example will read the chip factory ID \r\n and display the contents of the status registers.\r\n");

		int id = S25FL_ReadID();           	//read id - 0x01 ox16
		System.out.println("Manufacturer id: " + id); 
		long a = S25FL_Jedec_ID_Read();    	//0x01 0x40 0x17
		System.out.println("Jedec ID: " + a);

		int cell = S25FL_SReg_Read(STAT_REG1);
		System.out.println("Status register one: 0x" + Integer.toHexString(cell)); 
		cell = S25FL_SReg_Read(STAT_REG2);
		System.out.println("Status register two: 0x" + Integer.toHexString(cell));
		cell = S25FL_SReg_Read(STAT_REG3);
		System.out.println("Status register three: 0x" + Integer.toHexString(cell));

		System.out.println("End of demo.");
		SPI_Close();					//Close SPI peripheral
		

	   	JBcm2835Library.close();
		
	}
	
	private void S25FL_Setup() {
		CE_OUTPUT();				//Set CE0 pin as output
		CE_DESELECT();				//Deselect CE0 pin
		
	}
	
	private long S25FL_Jedec_ID_Read() {
		long jedid = 0;
	    int byte1, byte2, byte3 = 0;
	    CE_SELECT();                                //Enable device
	    SPI_Write(JEDEC);                           //Send JEDEC ID command (9Fh)    
	    byte1 = SPI_Read();
	    byte2 = SPI_Read();
	    byte3 = SPI_Read();
	    jedid = ((byte1 & 0x000000FF) << 16) | ((byte2 & 0x000000FF) << 8) | (byte3 & 0x000000FF);
	    CE_DESELECT();                              //Disable device
	    return jedid;
	}

	private int S25FL_ReadID() {
		 int deviceID = 0;
		 int man, dev = 0;
		 CE_SELECT();                      //Start SPI communication
		 SPI_Write(CMD_RDID);              //Send read ID command (90h or ABh)
		 SPI_Write((byte) 0x00);                  //Send dummy byte
		 SPI_Write((byte) 0x00);                  //Send dummy byte
		 SPI_Write((byte) 0x00);                  //Send 0x00
		 man = SPI_Read();                 //Send either manufacturer ID or device ID
		 dev = SPI_Read();
		 deviceID = (man << 8) | dev;      //Receive byte
		 CE_DESELECT();                    //Disable device
		 return deviceID;
	}
	
	private int S25FL_SReg_Read(byte statReg) {
		int b = 0;
	    CE_SELECT();			// enable device
	    SPI_Write(statReg);     // send RDSR command
	    b = SPI_Read();		// receive byte
	    CE_DESELECT();			// disable device
	    return b;
	}	

	private void S25FL_SReg_Write(byte statReg) {
	    CE_SELECT();			//Enable device
	    SPI_Write(CMD_WREN);	//Send WREN command
	    CE_DESELECT();			//Disable device

	    CE_SELECT();                        // enable device
	    SPI_Write(CMD_WRSR);                // select write to status register
	    SPI_Write(statReg);                 // data that will change the status of BPx or BPL (only bits 2,3,4,5,7 can be written)
	    CE_DESELECT();                      // disable the device
	}

	private void SPI_Initialize() {
		assertEquals("libray error", 1, JBcm2835Library.init());	
		
		JBcm2835Library.bcm2835_spi_begin();						//Configure SPI pins
		JBcm2835Library.bcm2835_spi_setBitOrder(SPIBitOrder.MSBFIRST);      	//Configure bit order
		JBcm2835Library.bcm2835_spi_setDataMode(SPIMode.SPI_MODE0);  			//Set clock polarity and phase CPOL=0, CPHA=0
		JBcm2835Library.bcm2835_spi_setClockDivider(SPIClockDivider.SPI_CLOCK_DIVIDER_4);	//SPI baud rate at 244 Khz
		JBcm2835Library.bcm2835_spi_chipSelect(SPIChipSelect.SPI_CS_NONE);			//Control CE0 in software
		System.out.println("SPI initialized...");
	}
	
	private void SPI_Close() {
		JBcm2835Library.bcm2835_spi_end();		
	}
	
	private byte SPI_Read() {
		byte data = JBcm2835Library.bcm2835_spi_transfer((byte) 0xff);
		return data;
	}
	
	private byte SPI_Write(byte data) {
		return JBcm2835Library.bcm2835_spi_transfer(data);
	}
	
	private void CE_OUTPUT() {
		JBcm2835Library.bcm2835_gpio_fsel(RPiGPIOPin.RPI_V2_GPIO_P1_26, FunctionSelect.GPIO_FSEL_OUTP);	//Set CE0 as output
	}
	
	private void CE_DESELECT() {
		JBcm2835Library.bcm2835_gpio_write(RPiGPIOPin.RPI_V2_GPIO_P1_26, JBcm2835Library.HIGH);					
	}
	
	private void CE_SELECT() {
		JBcm2835Library.bcm2835_gpio_write(RPiGPIOPin.RPI_V2_GPIO_P1_26, JBcm2835Library.LOW);
	}
}
