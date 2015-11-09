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