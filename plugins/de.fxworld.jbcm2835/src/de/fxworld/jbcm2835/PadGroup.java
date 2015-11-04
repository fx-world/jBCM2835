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