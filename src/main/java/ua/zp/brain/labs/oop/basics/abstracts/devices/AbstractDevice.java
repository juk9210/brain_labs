package ua.zp.brain.labs.oop.basics.abstracts.devices;

public abstract class AbstractDevice {
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

    abstract void powerOn();

    abstract void powerOff();

}
