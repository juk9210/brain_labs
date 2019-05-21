package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class Oven extends AbstractMulticooker {
    @Override
    void powerOn() {
        super.powerOn();
    }

    @Override
    void powerOff() {
        super.powerOff();
    }
    @Override
    void cook(){
        System.out.println("Cook a pie");
    }
    void initTimer(int time){
        System.out.println("Set the cooking time: "+time);
    }
}
