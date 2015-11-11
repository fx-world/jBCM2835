# jBCM2835

jBCM2835 is a Java Wrapper for the [BCM2835 C library](http://www.airspayce.com/mikem/bcm2835/) from Mike McCauley. It provides access to the GPIO, I2C and SPI on the Broadcom BCM2835 chip, like it is used in the [Raspberry Pi](https://www.raspberrypi.org). [JNAerator](http://jnaerator.googlecode.com/) was used to generate the initial wrapper class, but it was modified by hand afterwards.

For more information on the GPIO, look [here](https://www.raspberrypi.org/documentation/usage/gpio/).

It also includes a binding for [Pi4J](http://pi4j.com/).

## Download & Installation

There are different ways you can install jBCM2835. Maven is not supported, if you what that, leave me a message or open an issue here on github. 

### Download zip file

You can just download a zip file containing 4 jars. If you just want to use the jBCM2835 alone you need `com.sun.jna_version.jar` and `de.fxworld.jbcm2835_version.jar`. In the case you want to use the Pi4J binding, you need all 4 jars.

[Download](http://download.fx-world.de/jbcm2835/jBCM2835-1.0.0-SNAPSHOT.zip) 

### Eclipse update site

If you are developing with Eclipse or you want to build an Eclipse RCP, you can use the update site. 

[http://updates.fx-world.de/](http://updates.fx-world.de/)

## Usage

Be aware that you need to execute the code with root privileges, otherwise you will get an error. 
			
	RPiGPIOPin LED_PIN = RPiGPIOPin.RPI_GPIO_P1_12;
		
	JBcm2835Library.init();			
	JBcm2835Library.bcm2835_gpio_fsel(LED_PIN, FunctionSelect.GPIO_FSEL_OUTP);
		
	for (int i=0; i<10; i++) {
	
		JBcm2835Library.bcm2835_gpio_write(LED_PIN, JBcm2835Library.HIGH);				
		Thread.sleep(1000);		
	
		JBcm2835Library.bcm2835_gpio_write(LED_PIN, JBcm2835Library.LOW);	
		Thread.sleep(1000);
	}
	
	JBcm2835Library.close();

For more examples you can have a look at the [tests plugin](https://github.com/fx-world/jBCM2835/tree/master/plugins/de.fxworld.jbcm2835.tests/src/de/fxworld/jbcm2835/tests), there are examples how to use a [Sensorian Shield](http://sensorian.io/) connected to the [Raspberry Pi](https://www.raspberrypi.org).
	
## License

jBCM2835 is a Java Wrapper for the BCM2835 C library from Mike McCauley.  
Copyright (C) 2015 Pascal Weyprecht

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

[http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html](http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)