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
public enum PWMClockDivider {
	/**
	 * < 2048(9.375kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:538</i>
	 */
	PWM_CLOCK_DIVIDER_2048(2048),
	/**
	 * < 1024(18.75kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:539</i>
	 */
	PWM_CLOCK_DIVIDER_1024(1024),
	/**
	 * < 512(37.5kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:540</i>
	 */
	PWM_CLOCK_DIVIDER_512(512),
	/**
	 * < 256(75kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:541</i>
	 */
	PWM_CLOCK_DIVIDER_256(256),
	/**
	 * < 128(150kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:542</i>
	 */
	PWM_CLOCK_DIVIDER_128(128),
	/**
	 * < 64(300kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:543</i>
	 */
	PWM_CLOCK_DIVIDER_64(64),
	/**
	 * < 32(600.0kHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:544</i>
	 */
	PWM_CLOCK_DIVIDER_32(32),
	/**
	 * < 16(1.2MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:545</i>
	 */
	PWM_CLOCK_DIVIDER_16(16),
	/**
	 * < 8(2.4MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:546</i>
	 */
	PWM_CLOCK_DIVIDER_8(8),
	/**
	 * < 4(4.8MHz<br>
	 * <i>native declaration : src\main\c\bcm2835.h:547</i>
	 */
	PWM_CLOCK_DIVIDER_4(4),
	/**
	 * < 2(9.6MHz, fastest you can get<br>
	 * <i>native declaration : src\main\c\bcm2835.h:548</i>
	 */
	PWM_CLOCK_DIVIDER_2(2),
	/**
	 * < 1(4.6875kHz, same as divider 4096<br>
	 * <i>native declaration : src\main\c\bcm2835.h:549</i>
	 */
	PWM_CLOCK_DIVIDER_1(1);
	
	private int value;
	
	private PWMClockDivider(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}