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
