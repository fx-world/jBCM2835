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