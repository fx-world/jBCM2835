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
public enum SPIChipSelect {
	/**
	 * < Chip Select 0<br>
	 * <i>native declaration : src\main\c\bcm2835.h:386</i>
	 */
	SPI_CS0(0),
	/**
	 * < Chip Select 1<br>
	 * <i>native declaration : src\main\c\bcm2835.h:387</i>
	 */
	SPI_CS1(1),
	/**
	 * < Chip Select 2 (ie pins CS1 and CS2 are asserted)<br>
	 * <i>native declaration : src\main\c\bcm2835.h:388</i>
	 */
	SPI_CS2(2),
	/**
	 * < No CS, control it yourself<br>
	 * <i>native declaration : src\main\c\bcm2835.h:389</i>
	 */
	SPI_CS_NONE(3);
	
	private byte value;
	
	private SPIChipSelect(int value) {
		this.value = (byte) value;
	}
	
	public byte getValue() {
		return value;
	}
}