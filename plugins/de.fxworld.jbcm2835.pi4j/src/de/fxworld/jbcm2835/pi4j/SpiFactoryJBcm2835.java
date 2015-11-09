package de.fxworld.jbcm2835.pi4j;

import java.io.IOException;

import com.pi4j.io.spi.SpiChannel;
import com.pi4j.io.spi.SpiDevice;
import com.pi4j.io.spi.SpiMode;

import de.fxworld.jbcm2835.pi4j.impl.SpiDeviceImplJBcm2835;

class SpiFactoryJBcm2835 {

    private SpiFactoryJBcm2835() {
    }

    /**
     * Create new SpiDevice instance with a default SPI speed of 1 MHz.
     *
     * @param channel
     *            spi channel to use
     *
     * @return Return a new SpiDevice impl instance.
     *
     * @throws java.io.IOException
     */
    public static SpiDevice getInstance(SpiChannel channel) throws IOException {
        return new SpiDeviceImplJBcm2835(channel);
    }

    /**
     * Create new SpiDevice instance
     *
     * @param channel
     *            spi channel to use
     * @param mode
     *            spi mode (see http://en.wikipedia.org/wiki/Serial_Peripheral_Interface_Bus#Mode_numbers)
     *
     * @return Return a new SpiDevice impl instance.
     *
     * @throws java.io.IOException
     */
    public static SpiDevice getInstance(SpiChannel channel, SpiMode mode) throws IOException {
        return new SpiDeviceImplJBcm2835(channel, mode);
    }

    /**
     * Create new SpiDevice instance
     *
     * @param channel
     *            spi channel to use
     * @param speed
     *            spi speed/rate (in Hertz) for channel to communicate at
     *            (range is 500kHz - 32MHz)
     *
     * @return Return a new SpiDevice impl instance.
     *
     * @throws java.io.IOException
     */
    public static SpiDevice getInstance(SpiChannel channel, int speed) throws IOException {
        return new SpiDeviceImplJBcm2835(channel, speed);
    }

    /**
     * Create new SpiDevice instance
     *
     * @param channel
     *            spi channel to use
     * @param speed
     *            spi speed/rate (in Hertz) for channel to communicate at
     *            (range is 500kHz - 32MHz)
     * @param mode
     *            spi mode (see http://en.wikipedia.org/wiki/Serial_Peripheral_Interface_Bus#Mode_numbers)
     *
     * @return Return a new SpiDevice impl instance.
     *
     * @throws java.io.IOException
     */
    public static SpiDevice getInstance(SpiChannel channel, int speed, SpiMode mode) throws IOException {
        return new SpiDeviceImplJBcm2835(channel, speed, mode);
    }
}
