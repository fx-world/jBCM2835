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
 *    D.Qendri - initial C file from Sensorian
 *    Pascal Weyprecht - conversion to java
 */
package de.fxworld.jbcm2835.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.fxworld.jbcm2835.FunctionSelect;
import de.fxworld.jbcm2835.JBcm2835Library;
import de.fxworld.jbcm2835.RPiGPIOPin;

public class SensorianGpioLedTest {

	public static final RPiGPIOPin LED_PIN = RPiGPIOPin.RPI_GPIO_P1_12;
	public static final byte       HIGH    = JBcm2835Library.HIGH;
	public static final byte       LOW     = JBcm2835Library.LOW;
	
	public static void main(String[] args) {
		SensorianGpioLedTest test = new SensorianGpioLedTest();
		test.test();
	}

	@Test
	public void test() {
		assertEquals("libray error", 1, JBcm2835Library.init());
		
		System.out.println("LED blinking demo with the Sensorian Shield.");
				
		pinModeOutput(LED_PIN);
		
	   	for (int i=0; i<10; i++) {
			digitalWrite(LED_PIN, HIGH);		
			
			delay_ms(1000);		

			digitalWrite(LED_PIN, LOW);	

			delay_ms(1000);
	    }

	   	JBcm2835Library.close();
		
	}
	
	private void delay_ms(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * @brief Configures the given pin as output.
	 * @param pin PIN_t type 
	 * @return none
	 */	
	private void pinModeOutput(RPiGPIOPin pin) {
		JBcm2835Library.bcm2835_gpio_fsel(pin, FunctionSelect.GPIO_FSEL_OUTP);
	}

	/**
	 * @brief Write a logic level to the pin. The pin should be confgured as output.
	 * @param pin Pin to be configured, Available pin definitons are defined in the Utitlies.h
	 * @param level Logic level can be HIGH or LOW.
	 * @return none
	 */	
	private void digitalWrite(RPiGPIOPin pin, byte level) {
		JBcm2835Library.bcm2835_gpio_write(pin, level);			// set to level	
	}
}
