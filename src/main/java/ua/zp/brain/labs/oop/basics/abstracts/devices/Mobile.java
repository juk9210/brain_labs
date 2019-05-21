package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class Mobile extends AbstractPhone {
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

    @Override
    void powerOn() {
        System.out.println("Press the power button, the phone turns on");
    }

    @Override
    void powerOff() {
        System.out.println("Press the power button, the phone turns off");
    }

    @Override
    void call() {
        System.out.println("Go to the phone book, select a contact and call");
    }

}

