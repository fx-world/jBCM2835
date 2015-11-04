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
public enum SPIMode {
	/**
	 * < CPOL(0, CPHA(0<br>
	 * <i>native declaration : src\main\c\bcm2835.h:375</i>
	 */
	SPI_MODE0(0),
	/**
	 * < CPOL(0, CPHA(1<br>
	 * <i>native declaration : src\main\c\bcm2835.h:376</i>
	 */
	SPI_MODE1(1),
	/**
	 * < CPOL(1, CPHA(0<br>
	 * <i>native declaration : src\main\c\bcm2835.h:377</i>
	 */
	SPI_MODE2(2),
	/**
	 * < CPOL(1, CPHA(1<br>
	 * <i>native declaration : src\main\c\bcm2835.h:378</i>
	 */
	SPI_MODE3(3);
	
	private byte value;
	
	private SPIMode(int value) {
		this.value = (byte) value;
	}
	
	public byte getValue() {
		return value;
	}
}