package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class Mobile which extends AbstractPhone.
 *
 * @author Shakhov Yevhen.
 */

class Mobile extends AbstractPhone {
    /**
     * Create private fields,and their get/set.
     */
    private int simCount;
    private String display;

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Override method powerOnn.
     */
    @Override
    void powerOn() {
        System.out.println("Press the power button, the phone turns on");
    }

    /**
     * Override method powerOff.
     */
    @Override
    void powerOff() {
        System.out.println("Press the power button, the phone turns off");
    }

    /**
     * Override method call.
     */
    @Override
    void call() {
        System.out.println("Go to the phone book, select a contact and call");
    }

    /**
     * Create constructor with options.
     *
     * @param simCount
     * @param display
     */
    Mobile(int simCount, String display) {
        this.simCount = simCount;
        this.display = display;
    }
}

