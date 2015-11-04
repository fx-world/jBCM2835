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