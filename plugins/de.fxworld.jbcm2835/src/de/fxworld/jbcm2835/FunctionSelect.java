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
public enum FunctionSelect {
	/**
	 * < Input 0b000<br>
	 * <i>native declaration : src\main\c\bcm2835.h:176</i>
	 */
	GPIO_FSEL_INPT(0x00),
	/**
	 * < Output 0b001<br>
	 * <i>native declaration : src\main\c\bcm2835.h:177</i>
	 */
	GPIO_FSEL_OUTP(0x01),
	/**
	 * < Alternate function 0 0b100<br>
	 * <i>native declaration : src\main\c\bcm2835.h:178</i>
	 */
	GPIO_FSEL_ALT0(0x04),
	/**
	 * < Alternate function 1 0b101<br>
	 * <i>native declaration : src\main\c\bcm2835.h:179</i>
	 */
	GPIO_FSEL_ALT1(0x05),
	/**
	 * < Alternate function 2 0b110,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:180</i>
	 */
	GPIO_FSEL_ALT2(0x06),
	/**
	 * < Alternate function 3 0b111<br>
	 * <i>native declaration : src\main\c\bcm2835.h:181</i>
	 */
	GPIO_FSEL_ALT3(0x07),
	/**
	 * < Alternate function 4 0b011<br>
	 * <i>native declaration : src\main\c\bcm2835.h:182</i>
	 */
	GPIO_FSEL_ALT4(0x03),
	/**
	 * < Alternate function 5 0b010<br>
	 * <i>native declaration : src\main\c\bcm2835.h:183</i>
	 */
	GPIO_FSEL_ALT5(0x02),
	/**
	 * < Function select bits mask 0b111<br>
	 * <i>native declaration : src\main\c\bcm2835.h:184</i>
	 */
	GPIO_FSEL_MASK(0x07);
	
	private byte value;
	
	private FunctionSelect(int value) {
		this.value = (byte) value;
	}
	
	public byte getValue() {
		return value;
	}
}