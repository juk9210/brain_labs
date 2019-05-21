package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class DialPhone extends AbstractPhone {
    private boolean hasAnswerPhone;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }
    @Override
    void powerOn(){
        System.out.println("Turn on the socket,the phone works");
    }
    @Override
    void powerOff(){
        System.out.println("Turn out the socket, the phone does not work");
    }
    @Override
    void call(){
        System.out.println("Pick up the phone,dial the number and call");
    }
    void autoAnswer(){
        System.out.println("The phone automatically picks up the phone");
    }
}
