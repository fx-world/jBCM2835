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
public enum RPiGPIOPin {
	/**
	 * < Version 1, Pin P1-03<br>
	 * <i>native declaration : src\main\c\bcm2835.h:241</i>
	 */
	RPI_GPIO_P1_03(0),
	/**
	 * < Version 1, Pin P1-05<br>
	 * <i>native declaration : src\main\c\bcm2835.h:242</i>
	 */
	RPI_GPIO_P1_05(1),
	/**
	 * < Version 1, Pin P1-07<br>
	 * <i>native declaration : src\main\c\bcm2835.h:243</i>
	 */
	RPI_GPIO_P1_07(4),
	/**
	 * < Version 1, Pin P1-08, defaults to alt function 0 UART0_TXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:244</i>
	 */
	RPI_GPIO_P1_08(14),
	/**
	 * < Version 1, Pin P1-10, defaults to alt function 0 UART0_RXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:245</i>
	 */
	RPI_GPIO_P1_10(15),
	/**
	 * < Version 1, Pin P1-11<br>
	 * <i>native declaration : src\main\c\bcm2835.h:246</i>
	 */
	RPI_GPIO_P1_11(17),
	/**
	 * < Version 1, Pin P1-12, can be PWM channel 0 in ALT FUN 5<br>
	 * <i>native declaration : src\main\c\bcm2835.h:247</i>
	 */
	RPI_GPIO_P1_12(18),
	/**
	 * < Version 1, Pin P1-13<br>
	 * <i>native declaration : src\main\c\bcm2835.h:248</i>
	 */
	RPI_GPIO_P1_13(21),
	/**
	 * < Version 1, Pin P1-15<br>
	 * <i>native declaration : src\main\c\bcm2835.h:249</i>
	 */
	RPI_GPIO_P1_15(22),
	/**
	 * < Version 1, Pin P1-16<br>
	 * <i>native declaration : src\main\c\bcm2835.h:250</i>
	 */
	RPI_GPIO_P1_16(23),
	/**
	 * < Version 1, Pin P1-18<br>
	 * <i>native declaration : src\main\c\bcm2835.h:251</i>
	 */
	RPI_GPIO_P1_18(24),
	/**
	 * < Version 1, Pin P1-19, MOSI when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:252</i>
	 */
	RPI_GPIO_P1_19(10),
	/**
	 * < Version 1, Pin P1-21, MISO when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:253</i>
	 */
	RPI_GPIO_P1_21(9),
	/**
	 * < Version 1, Pin P1-22<br>
	 * <i>native declaration : src\main\c\bcm2835.h:254</i>
	 */
	RPI_GPIO_P1_22(25),
	/**
	 * < Version 1, Pin P1-23, CLK when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:255</i>
	 */
	RPI_GPIO_P1_23(11),
	/**
	 * < Version 1, Pin P1-24, CE0 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:256</i>
	 */
	RPI_GPIO_P1_24(8),
	/**
	 * < Version 1, Pin P1-26, CE1 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:257</i>
	 */
	RPI_GPIO_P1_26(7),
	/**
	 * < Version 2, Pin P1-03<br>
	 * <i>native declaration : src\main\c\bcm2835.h:260</i>
	 */
	RPI_V2_GPIO_P1_03(2),
	/**
	 * < Version 2, Pin P1-05<br>
	 * <i>native declaration : src\main\c\bcm2835.h:261</i>
	 */
	RPI_V2_GPIO_P1_05(3),
	/**
	 * < Version 2, Pin P1-07<br>
	 * <i>native declaration : src\main\c\bcm2835.h:262</i>
	 */
	RPI_V2_GPIO_P1_07(4),
	/**
	 * < Version 2, Pin P1-08, defaults to alt function 0 UART0_TXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:263</i>
	 */
	RPI_V2_GPIO_P1_08(14),
	/**
	 * < Version 2, Pin P1-10, defaults to alt function 0 UART0_RXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:264</i>
	 */
	RPI_V2_GPIO_P1_10(15),
	/**
	 * < Version 2, Pin P1-11<br>
	 * <i>native declaration : src\main\c\bcm2835.h:265</i>
	 */
	RPI_V2_GPIO_P1_11(17),
	/**
	 * < Version 2, Pin P1-12, can be PWM channel 0 in ALT FUN 5<br>
	 * <i>native declaration : src\main\c\bcm2835.h:266</i>
	 */
	RPI_V2_GPIO_P1_12(18),
	/**
	 * < Version 2, Pin P1-13<br>
	 * <i>native declaration : src\main\c\bcm2835.h:267</i>
	 */
	RPI_V2_GPIO_P1_13(27),
	/**
	 * < Version 2, Pin P1-15<br>
	 * <i>native declaration : src\main\c\bcm2835.h:268</i>
	 */
	RPI_V2_GPIO_P1_15(22),
	/**
	 * < Version 2, Pin P1-16<br>
	 * <i>native declaration : src\main\c\bcm2835.h:269</i>
	 */
	RPI_V2_GPIO_P1_16(23),
	/**
	 * < Version 2, Pin P1-18<br>
	 * <i>native declaration : src\main\c\bcm2835.h:270</i>
	 */
	RPI_V2_GPIO_P1_18(24),
	/**
	 * < Version 2, Pin P1-19, MOSI when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:271</i>
	 */
	RPI_V2_GPIO_P1_19(10),
	/**
	 * < Version 2, Pin P1-21, MISO when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:272</i>
	 */
	RPI_V2_GPIO_P1_21(9),
	/**
	 * < Version 2, Pin P1-22<br>
	 * <i>native declaration : src\main\c\bcm2835.h:273</i>
	 */
	RPI_V2_GPIO_P1_22(25),
	/**
	 * < Version 2, Pin P1-23, CLK when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:274</i>
	 */
	RPI_V2_GPIO_P1_23(11),
	/**
	 * < Version 2, Pin P1-24, CE0 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:275</i>
	 */
	RPI_V2_GPIO_P1_24(8),
	/**
	 * < Version 2, Pin P1-26, CE1 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:276</i>
	 */
	RPI_V2_GPIO_P1_26(7),
	/**
	 * < Version 2, Pin P1-29<br>
	 * <i>native declaration : src\main\c\bcm2835.h:277</i>
	 */
	RPI_V2_GPIO_P1_29(5),
	/**
	 * < Version 2, Pin P1-31<br>
	 * <i>native declaration : src\main\c\bcm2835.h:278</i>
	 */
	RPI_V2_GPIO_P1_31(6),
	/**
	 * < Version 2, Pin P1-32<br>
	 * <i>native declaration : src\main\c\bcm2835.h:279</i>
	 */
	RPI_V2_GPIO_P1_32(12),
	/**
	 * < Version 2, Pin P1-33<br>
	 * <i>native declaration : src\main\c\bcm2835.h:280</i>
	 */
	RPI_V2_GPIO_P1_33(13),
	/**
	 * < Version 2, Pin P1-35<br>
	 * <i>native declaration : src\main\c\bcm2835.h:281</i>
	 */
	RPI_V2_GPIO_P1_35(19),
	/**
	 * < Version 2, Pin P1-36<br>
	 * <i>native declaration : src\main\c\bcm2835.h:282</i>
	 */
	RPI_V2_GPIO_P1_36(16),
	/**
	 * < Version 2, Pin P1-37<br>
	 * <i>native declaration : src\main\c\bcm2835.h:283</i>
	 */
	RPI_V2_GPIO_P1_37(26),
	/**
	 * < Version 2, Pin P1-38<br>
	 * <i>native declaration : src\main\c\bcm2835.h:284</i>
	 */
	RPI_V2_GPIO_P1_38(20),
	/**
	 * < Version 2, Pin P1-40<br>
	 * <i>native declaration : src\main\c\bcm2835.h:285</i>
	 */
	RPI_V2_GPIO_P1_40(21),
	/**
	 * < Version 2, Pin P5-03<br>
	 * <i>native declaration : src\main\c\bcm2835.h:288</i>
	 */
	RPI_V2_GPIO_P5_03(28),
	/**
	 * < Version 2, Pin P5-04<br>
	 * <i>native declaration : src\main\c\bcm2835.h:289</i>
	 */
	RPI_V2_GPIO_P5_04(29),
	/**
	 * < Version 2, Pin P5-05<br>
	 * <i>native declaration : src\main\c\bcm2835.h:290</i>
	 */
	RPI_V2_GPIO_P5_05(30),
	/**
	 * < Version 2, Pin P5-06<br>
	 * <i>native declaration : src\main\c\bcm2835.h:291</i>
	 */
	RPI_V2_GPIO_P5_06(31),
	/**
	 * < B+, Pin J8-03<br>
	 * <i>native declaration : src\main\c\bcm2835.h:294</i>
	 */
	RPI_BPLUS_GPIO_J8_03(2),
	/**
	 * < B+, Pin J8-05<br>
	 * <i>native declaration : src\main\c\bcm2835.h:295</i>
	 */
	RPI_BPLUS_GPIO_J8_05(3),
	/**
	 * < B+, Pin J8-07<br>
	 * <i>native declaration : src\main\c\bcm2835.h:296</i>
	 */
	RPI_BPLUS_GPIO_J8_07(4),
	/**
	 * < B+, Pin J8-08, defaults to alt function 0 UART0_TXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:297</i>
	 */
	RPI_BPLUS_GPIO_J8_08(14),
	/**
	 * < B+, Pin J8-10, defaults to alt function 0 UART0_RXD<br>
	 * <i>native declaration : src\main\c\bcm2835.h:298</i>
	 */
	RPI_BPLUS_GPIO_J8_10(15),
	/**
	 * < B+, Pin J8-11<br>
	 * <i>native declaration : src\main\c\bcm2835.h:299</i>
	 */
	RPI_BPLUS_GPIO_J8_11(17),
	/**
	 * < B+, Pin J8-12, can be PWM channel 0 in ALT FUN 5<br>
	 * <i>native declaration : src\main\c\bcm2835.h:300</i>
	 */
	RPI_BPLUS_GPIO_J8_12(18),
	/**
	 * < B+, Pin J8-13<br>
	 * <i>native declaration : src\main\c\bcm2835.h:301</i>
	 */
	RPI_BPLUS_GPIO_J8_13(27),
	/**
	 * < B+, Pin J8-15<br>
	 * <i>native declaration : src\main\c\bcm2835.h:302</i>
	 */
	RPI_BPLUS_GPIO_J8_15(22),
	/**
	 * < B+, Pin J8-16<br>
	 * <i>native declaration : src\main\c\bcm2835.h:303</i>
	 */
	RPI_BPLUS_GPIO_J8_16(23),
	/**
	 * < B+, Pin J8-18<br>
	 * <i>native declaration : src\main\c\bcm2835.h:304</i>
	 */
	RPI_BPLUS_GPIO_J8_18(24),
	/**
	 * < B+, Pin J8-19, MOSI when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:305</i>
	 */
	RPI_BPLUS_GPIO_J8_19(10),
	/**
	 * < B+, Pin J8-21, MISO when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:306</i>
	 */
	RPI_BPLUS_GPIO_J8_21(9),
	/**
	 * < B+, Pin J8-22<br>
	 * <i>native declaration : src\main\c\bcm2835.h:307</i>
	 */
	RPI_BPLUS_GPIO_J8_22(25),
	/**
	 * < B+, Pin J8-23, CLK when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:308</i>
	 */
	RPI_BPLUS_GPIO_J8_23(11),
	/**
	 * < B+, Pin J8-24, CE0 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:309</i>
	 */
	RPI_BPLUS_GPIO_J8_24(8),
	/**
	 * < B+, Pin J8-26, CE1 when SPI0 in use<br>
	 * <i>native declaration : src\main\c\bcm2835.h:310</i>
	 */
	RPI_BPLUS_GPIO_J8_26(7),
	/**
	 * < B+, Pin J8-29,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:311</i>
	 */
	RPI_BPLUS_GPIO_J8_29(5),
	/**
	 * < B+, Pin J8-31,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:312</i>
	 */
	RPI_BPLUS_GPIO_J8_31(6),
	/**
	 * < B+, Pin J8-32,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:313</i>
	 */
	RPI_BPLUS_GPIO_J8_32(12),
	/**
	 * < B+, Pin J8-33,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:314</i>
	 */
	RPI_BPLUS_GPIO_J8_33(13),
	/**
	 * < B+, Pin J8-35,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:315</i>
	 */
	RPI_BPLUS_GPIO_J8_35(19),
	/**
	 * < B+, Pin J8-36,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:316</i>
	 */
	RPI_BPLUS_GPIO_J8_36(16),
	/**
	 * < B+, Pin J8-37,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:317</i>
	 */
	RPI_BPLUS_GPIO_J8_37(26),
	/**
	 * < B+, Pin J8-38,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:318</i>
	 */
	RPI_BPLUS_GPIO_J8_38(20),
	/**
	 * < B+, Pin J8-40,<br>
	 * <i>native declaration : src\main\c\bcm2835.h:319</i>
	 */
	RPI_BPLUS_GPIO_J8_40(21);
	
	private byte value;
	
	private RPiGPIOPin(int value) {
		this.value = (byte) value;
	}
	
	public byte getValue() {
		return value;
	}
}