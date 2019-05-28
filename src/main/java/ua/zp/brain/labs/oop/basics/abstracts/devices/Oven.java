package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class Oven which extends AbstractMulticooker.
 *
 * @author Shakhov Yevhen.
 */

public class Oven extends AbstractMulticooker {
    /**
     * Override method powerOn.
     */
    @Override
    void powerOn() {
        super.powerOn();
    }

    /**
     * Override method powerOff.
     */
    @Override
    void powerOff() {
        super.powerOff();
    }

    /**
     * Override method cook.
     */
    @Override
    void cook() {
        System.out.println("Cook a pie");
    }

    /**
     * Create method initTimer.
     *
     * @param time
     */
    void initTimer(int time) {
        System.out.println("Set the cooking time: " + time);
    }
}
