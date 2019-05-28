package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class Multicooker which extends AbstractMulticooker.
 *
 * @author Shakhov Yevhen.
 */

public class Multicooker extends AbstractMulticooker {
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
        System.out.println("Cook soup");
    }

    /**
     * Create method switchProgram.
     *
     * @param program
     */
    void switchProgram(int program) {
        System.out.println("Choose the program number: " + program);
    }
}
