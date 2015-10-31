# jBCM2835

jBCM2835 is a Java Wrapper for the [BCM2835 C library](http://www.airspayce.com/mikem/bcm2835/) from Mike McCauley. It provides access to the GPIO, I2C and SPI on the Broadcom BCM2835 chip, like it is used in the [Raspberry Pi](https://www.raspberrypi.org). [JNAerator](http://jnaerator.googlecode.com/) was used to generate the initial wrapper class, but it was modified by hand afterwards.

For more information on the GPIO, look [here](https://www.raspberrypi.org/documentation/usage/gpio/).

## Download & Installation

## Usage

Root execution 
			
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
	
## License

GNU General Public License (GPL), Version 2.0

[http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html](http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)