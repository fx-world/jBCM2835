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
package de.fxworld.jbcm2835;

/**
 * Specifies the divider used to generate the SPI clock from the system clock.
 * Figures below give the divider, clock period and clock frequency.
 * Clock divided is based on nominal base clock rate of 250MHz
 * It is reported that (contrary to the documentation) any even divider may used.
 * The frequencies shown for each divider have been confirmed by measurement.
 */
public enum SPIClockDivider {

	SPI_CLOCK_DIVIDER_65536(0, 3814.697260),
	SPI_CLOCK_DIVIDER_32768(32768, 7629.394531),
	SPI_CLOCK_DIVIDER_16384(16384, 15258.78906),
	SPI_CLOCK_DIVIDER_8192(8192, 30517.57813),
	SPI_CLOCK_DIVIDER_4096(4096, 61035.15625),
	SPI_CLOCK_DIVIDER_2048(2048, 122070.3125),
	SPI_CLOCK_DIVIDER_1024(1024, 244140.625),
	SPI_CLOCK_DIVIDER_512(512, 488281.25),
	SPI_CLOCK_DIVIDER_256(256, 976562.5),
	SPI_CLOCK_DIVIDER_128(128, 1953125),
	SPI_CLOCK_DIVIDER_64(64, 3906250),
	SPI_CLOCK_DIVIDER_32(32, 7812500),
	SPI_CLOCK_DIVIDER_16(16, 15625000),
	SPI_CLOCK_DIVIDER_8(8, 31250000),
	SPI_CLOCK_DIVIDER_4(4, 62500000),
	SPI_CLOCK_DIVIDER_2(2, 125000000),
	SPI_CLOCK_DIVIDER_1(1, 3814.697260);
	
	private short  value;
	private double speed;
	
	private SPIClockDivider(int value, double speed) {
		this.value = (short) value;
		this.speed = speed;
	}
	
	/**
	 * Returns the value required for the bcm2835 API.
	 * 
	 * @return value
	 */
	public short getValue() {
		return value;
	}
	
	/**
	 * Returns the closest clock divider for a given speed in Hz.
	 * 
	 * @param speed in Hz
	 * @return the closest clock divider
	 */
	public static SPIClockDivider getClosest(double speed) {
		SPIClockDivider result = SPI_CLOCK_DIVIDER_65536;
		double          diff   = Math.abs(SPI_CLOCK_DIVIDER_65536.speed - speed);
		
		for (SPIClockDivider divider : values()) {
			double newDiff = Math.abs(divider.speed - speed);
			
			if (newDiff < diff) {
				diff   = newDiff;
				result = divider;
			}
		}

		return result;
	}
}