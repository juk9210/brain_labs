package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create abstract class Multicooker which AbstractDevice.
 *
 * @author Shakhov Yevhen.
 */

abstract class AbstractMulticooker extends AbstractDevice {
    /**
     * Override method powerOn.
     */
    @Override
    void powerOn() {
        System.out.println("Turn on the socket,the oven turns on");
    }

    /**
     * Override method powerOff.
     */
    @Override
    void powerOff() {
        System.out.println("Turn out the socket,the oven turns off");
    }

    /**
     * Create abstract method cook.
     */
    abstract void cook();
}
