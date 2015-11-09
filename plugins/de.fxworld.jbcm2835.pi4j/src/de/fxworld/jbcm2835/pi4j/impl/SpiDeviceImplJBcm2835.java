package de.fxworld.jbcm2835.pi4j.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import com.pi4j.io.spi.SpiChannel;
import com.pi4j.io.spi.SpiDevice;
import com.pi4j.io.spi.SpiMode;

import de.fxworld.jbcm2835.JBcm2835Library;

public class SpiDeviceImplJBcm2835 implements SpiDevice {

	protected final SpiChannel channel;
    protected final SpiMode mode;
	
	/**
     * Creates the SPI Device at the given spi and input channel
     *
     * @param channel
     *            spi channel to use
     * @param speed
     *            spi speed/rate (in Hertz) for channel to communicate at
     *            (range is 500kHz - 32MHz)
     */
    public SpiDeviceImplJBcm2835(SpiChannel channel, int speed) throws IOException {
        this(channel, speed, DEFAULT_SPI_MODE);
    }

    /**
     * Creates the SPI Device at the given SPI and input channel
     * (A default speed of 1 MHz will be used)
     *
     * @param channel
     *            spi channel to use
     * @param mode
     *            spi mode (see http://en.wikipedia.org/wiki/Serial_Peripheral_Interface_Bus#Mode_numbers)
     */
    public SpiDeviceImplJBcm2835(SpiChannel channel, SpiMode mode) throws IOException {
        this(channel, DEFAULT_SPI_SPEED, mode);
    }

    /**
     * Creates the SPI Device at the given SPI and input channel
     * (A default speed of 1 MHz will be used)
     *
     * @param channel
     *            spi channel to use
     */
    public SpiDeviceImplJBcm2835(SpiChannel channel) throws IOException {
        this(channel, DEFAULT_SPI_SPEED);
    }
	
	

	public SpiDeviceImplJBcm2835(SpiChannel channel, int speed, SpiMode mode) {
		this.channel = channel;
		this.mode    = mode;
		// TODO Auto-generated constructor stub
	}

	@Override
    public ByteBuffer write(ByteBuffer data) throws IOException {
        //return ByteBuffer.wrap(write(data.array()));
		//JBcm2835Library.bcm2835_spi_transfernb(tbuf, rbuf, len);
		// TODO implement method
		return data;
    }
	
	@Override
	public byte[] write(byte[] data, int start, int length) throws IOException {
		
		
		
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public short[] write(short[] data, int start, int length) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public byte[] write(InputStream input) throws IOException {

        // ensure bytes are available
        if(input.available() <= 0){
            throw new IOException("No available bytes in input stream to write to SPI channel: " + channel.getChannel());
        }
        else if(input.available() > MAX_SUPPORTED_BYTES){
            throw new IOException("Number of bytes in stream exceed the maximum bytes allowed to write SPI channel in a single call");
        }

        // create a temporary buffer to store read bytes from stream
        byte[] buffer = new byte[MAX_SUPPORTED_BYTES];

        // read maximum number of supported bytes
        int length = input.read(buffer, 0 , MAX_SUPPORTED_BYTES);

        // write bytes to SPI channel
        return write(buffer, 0, length);
    }
	
	@Override
    public int write(InputStream input, OutputStream output) throws IOException {
        // write stream data to SPI device
        byte[] buffer = write(input);

        //write resulting byte array to output stream
        output.write(buffer);

        // return data length
        return buffer.length;
    }

	
    @Override
    public String write(String data, String charset) throws IOException {
        byte[] buffer = data.getBytes(charset);
        return new String(write(buffer), charset);
    }

    @Override
    public String write(String data, Charset charset) throws IOException {
        byte[] buffer = data.getBytes(charset);
        return new String(write(buffer), charset);
    }

   	@Override
    public byte[] write(byte... data) throws IOException {
        return write(data, 0, data.length);
    }

    @Override
    public short[] write(short... data) throws IOException {
        return write(data, 0, data.length);
    }

}
