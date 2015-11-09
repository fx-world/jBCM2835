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
public enum PadGroup {
	/**
	 * < Pad group for GPIO pads 0 to 27<br>
	 * <i>native declaration : src\main\c\bcm2835.h:220</i>
	 */
	PAD_GROUP_GPIO_0_27(0),
	/**
	 * < Pad group for GPIO pads 28 to 45<br>
	 * <i>native declaration : src\main\c\bcm2835.h:221</i>
	 */
	PAD_GROUP_GPIO_28_45(1),
	/**
	 * < Pad group for GPIO pads 46 to 53<br>
	 * <i>native declaration : src\main\c\bcm2835.h:222</i>
	 */
	PAD_GROUP_GPIO_46_53(2);
	
	private int value;
	
	private PadGroup(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}