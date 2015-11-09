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
 * <i>native declaration : src\main\c\bcm2835.h</i><br>
 * enum values
 */
public enum I2CClockDivider {
	/**
	 * < 2500(10us(100 kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:463</i>
	 */
	I2C_CLOCK_DIVIDER_2500(2500),
	/**
	 * < 622(2.504us(399.3610 kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:464</i>
	 */
	I2C_CLOCK_DIVIDER_626(626),
	/**
	 * < 150(60ns(1.666 MHz (default at reset)<br>
	 * <i>native declaration : src\main\c\bcm2835.h:465</i>
	 */
	I2C_CLOCK_DIVIDER_150(150),
	/**
	 * < 148(59ns(1.689 MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:466</i>
	 */
	I2C_CLOCK_DIVIDER_148(148);
	
	private short value;
	
	private I2CClockDivider(int value) {
		this.value = (short) value;
	}
	
	public short getValue() {
		return value;
	}
}