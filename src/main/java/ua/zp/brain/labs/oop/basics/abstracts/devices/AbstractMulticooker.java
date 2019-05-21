package ua.zp.brain.labs.oop.basics.abstracts.devices;

abstract class AbstractMulticooker extends AbstractDevice {
    @Override
    void powerOn() {
        System.out.println("Turn on the socket,the oven turns on");
    }

    @Override
    void powerOff() {
        System.out.println("Turn out the socket,the oven turns off");
    }

    abstract void cook();
}
