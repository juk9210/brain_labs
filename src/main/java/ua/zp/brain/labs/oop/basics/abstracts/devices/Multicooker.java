package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class Multicooker extends AbstractMulticooker {

    @Override
    void powerOn() {
        super.powerOn();
    }

    @Override
    void powerOff() {
        super.powerOff();
    }

    @Override
    void cook() {
        System.out.println("Cook soup");
    }

    void switchProgram(int program) {
        System.out.println("Choose the program number: " + program);
    }
}
