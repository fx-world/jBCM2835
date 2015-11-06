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
public enum PUDControl {
	/**
	 * < Off ? disable pull-up/down 0b00<br>
	 * <i>native declaration : src\main\c\bcm2835.h:192</i>
	 */
	GPIO_PUD_OFF(0x00),
	/**
	 * < Enable Pull Down control 0b01<br>
	 * <i>native declaration : src\main\c\bcm2835.h:193</i>
	 */
	GPIO_PUD_DOWN(0x01),
	/**
	 * < Enable Pull Up control 0b10<br>
	 * <i>native declaration : src\main\c\bcm2835.h:194</i>
	 */
	GPIO_PUD_UP(0x02);
	
	private int value;
	
	private PUDControl(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}