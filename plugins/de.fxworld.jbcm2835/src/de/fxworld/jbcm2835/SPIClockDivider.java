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
package de.fxworld.jbcm2835;

/**
 * <i>native declaration : src\main\c\bcm2835.h</i><br>
 * enum values
 */
public enum SPIClockDivider {
	/**
	 * < 65536(262.144us(3.814697260kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:401</i>
	 */
	SPI_CLOCK_DIVIDER_65536(0),
	/**
	 * < 32768(131.072us(7.629394531kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:402</i>
	 */
	SPI_CLOCK_DIVIDER_32768(32768),
	/**
	 * < 16384(65.536us(15.25878906kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:403</i>
	 */
	SPI_CLOCK_DIVIDER_16384(16384),
	/**
	 * < 8192(32.768us(30/51757813kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:404</i>
	 */
	SPI_CLOCK_DIVIDER_8192(8192),
	/**
	 * < 4096(16.384us(61.03515625kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:405</i>
	 */
	SPI_CLOCK_DIVIDER_4096(4096),
	/**
	 * < 2048(8.192us(122.0703125kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:406</i>
	 */
	SPI_CLOCK_DIVIDER_2048(2048),
	/**
	 * < 1024(4.096us(244.140625kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:407</i>
	 */
	SPI_CLOCK_DIVIDER_1024(1024),
	/**
	 * < 512(2.048us(488.28125kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:408</i>
	 */
	SPI_CLOCK_DIVIDER_512(512),
	/**
	 * < 256(1.024us(976.5625MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:409</i>
	 */
	SPI_CLOCK_DIVIDER_256(256),
	/**
	 * < 128(512ns(= 1.953125MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:410</i>
	 */
	SPI_CLOCK_DIVIDER_128(128),
	/**
	 * < 64(256ns(3.90625MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:411</i>
	 */
	SPI_CLOCK_DIVIDER_64(64),
	/**
	 * < 32(128ns(7.8125MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:412</i>
	 */
	SPI_CLOCK_DIVIDER_32(32),
	/**
	 * < 16(64ns(15.625MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:413</i>
	 */
	SPI_CLOCK_DIVIDER_16(16),
	/**
	 * < 8(32ns(31.25MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:414</i>
	 */
	SPI_CLOCK_DIVIDER_8(8),
	/**
	 * < 4(16ns(62.5MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:415</i>
	 */
	SPI_CLOCK_DIVIDER_4(4),
	/**
	 * < 2(8ns(125MHz, fastest you can get<br>
	 * <i>native declaration : src\main\c\bcm2835.h:416</i>
	 */
	SPI_CLOCK_DIVIDER_2(2),
	/**
	 * < 1(262.144us(3.814697260kHz, same as 0/65536<br>
	 * <i>native declaration : src\main\c\bcm2835.h:417</i>
	 */
	SPI_CLOCK_DIVIDER_1(1);
	
	private short value;
	
	private SPIClockDivider(int value) {
		this.value = (short) value;
	}
	
	public short getValue() {
		return value;
	}
}