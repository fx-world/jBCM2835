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
public enum SPIBitOrder {
	
	/**
	 * < LSB First<br>
	 * <i>native declaration : src\main\c\bcm2835.h:366</i>
	 */
	LSBFIRST(0),
	
	/**
	 * < MSB First<br>
	 * <i>native declaration : src\main\c\bcm2835.h:367</i>
	 */
	MSBFIRST(1);
	
	private byte value;
	
	private SPIBitOrder(int value) {
		this.value = (byte) value;
	}
	
	public byte getValue() {
		return value;
	}
}