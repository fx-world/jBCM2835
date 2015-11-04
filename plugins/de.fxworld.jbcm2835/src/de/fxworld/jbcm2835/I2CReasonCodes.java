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
public enum I2CReasonCodes {
	/**
	 * < Success<br>
	 * <i>native declaration : src\main\c\bcm2835.h:474</i>
	 */
	I2C_REASON_OK(0x00),
	/**
	 * < Received a NACK<br>
	 * <i>native declaration : src\main\c\bcm2835.h:475</i>
	 */
	I2C_REASON_ERROR_NACK(0x01),
	/**
	 * < Received Clock Stretch Timeout<br>
	 * <i>native declaration : src\main\c\bcm2835.h:476</i>
	 */
	I2C_REASON_ERROR_CLKT(0x02),
	/**
	 * < Not all data is sent / received<br>
	 * <i>native declaration : src\main\c\bcm2835.h:477</i>
	 */
	I2C_REASON_ERROR_DATA(0x04);
		
	private int value;
	
	private I2CReasonCodes(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}