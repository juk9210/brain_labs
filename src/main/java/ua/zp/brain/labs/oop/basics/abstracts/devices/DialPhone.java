package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class DialPhone which extends AbstractPhone.
 *
 * @author Shakhov Yevhen.
 */

class DialPhone extends AbstractPhone {
    /**
     * Create private fields,and their get/set.
     */
    private boolean hasAnswerPhone;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    /**
     * Override method powerOn.
     */
    @Override
    void powerOn() {
        System.out.println("Turn on the socket,the phone works");
    }

    /**
     * Override method powerOff.
     */
    @Override
    void powerOff() {
        System.out.println("Turn out the socket, the phone does not work");
    }

    /**
     * Override method call.
     */
    @Override
    void call() {
        System.out.println("Pick up the phone,dial the number and call");
    }

    /**
     * Create method autoAnswew.
     */
    void autoAnswer() {
        System.out.println("The phone automatically picks up the phone");
    }

    /**
     * Create constructor with options.
     *
     * @param hasAnswerPhone
     */
    DialPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }
}
