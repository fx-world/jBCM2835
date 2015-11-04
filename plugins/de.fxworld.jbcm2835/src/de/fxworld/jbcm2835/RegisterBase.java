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