package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class SmartPhone which extends Mobile.
 *
 * @author Shakhov Yevhen.
 */

class SmartPhone extends Mobile {
    /**
     * Create private fields,and their get/set.
     */
    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * Create method runApp.
     */
    void runApp() {
        System.out.println("Run the app");
    }

    /**
     * Create constructor with options.
     *
     * @param simCount
     * @param display
     * @param os
     */
    SmartPhone(int simCount, String display, String os) {
        super(simCount, display);
        this.os = os;
    }

}
