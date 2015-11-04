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
package de.fxworld.jbcm2835.pi4j;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CFactoryProvider;

import de.fxworld.jbcm2835.pi4j.impl.I2CBusImplJBcm2835;

public class I2CFactoryProviderJBcm2835 implements I2CFactoryProvider {

	@Override
	public I2CBus getBus(int busNumber) throws IOException {		
		return I2CBusImplJBcm2835.getBus(busNumber);
	}

}
