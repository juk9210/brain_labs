package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create abstract class Device.
 *
 * @author Shakhov Yevhen.
 */

abstract class AbstractDevice {
    /**
     * Create private fields,and their get/set.
     */
    private String name;
    private Integer serial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    /**
     * Create abstract methods - powerOn and powerOff.
     */
    abstract void powerOn();

    abstract void powerOff();

    /**
     * Create constructor which implements the method powerOn.
     */
    AbstractDevice() {
        powerOn();
    }
}
