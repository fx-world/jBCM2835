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
public enum RegisterBase {
	/**
	 * < Base of the ST (System Timer) registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:118</i>
	 */
	REGBASE_ST(1),
	/**
	 * < Base of the GPIO registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:119</i>
	 */
	REGBASE_GPIO(2),
	/**
	 * < Base of the PWM registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:120</i>
	 */
	REGBASE_PWM(3),
	/**
	 * < Base of the CLK registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:121</i>
	 */
	REGBASE_CLK(4),
	/**
	 * < Base of the PADS registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:122</i>
	 */
	REGBASE_PADS(5),
	/**
	 * Base of the SPI0 registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:123</i>
	 */
	REGBASE_SPI0(6),
	/**
	 * < Base of the BSC0 registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:124</i>
	 */
	REGBASE_BSC0(7),
	/**
	 * < Base of the BSC1 registers.<br>
	 * <i>native declaration : src\main\c\bcm2835.h:125</i>
	 */
	REGBASE_BSC1(8);
	
	private int value;
	
	private RegisterBase(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}