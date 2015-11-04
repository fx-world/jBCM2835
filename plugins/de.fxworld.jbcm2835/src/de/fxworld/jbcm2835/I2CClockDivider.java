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