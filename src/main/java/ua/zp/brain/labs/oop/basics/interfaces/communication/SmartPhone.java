package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create class SmartPhone which implements Caller,EmailSender.
 *
 * @author Shakhov Yevhen.
 */

class SmartPhone implements Caller, EmailSender {
    /**
     * Create method call.
     *
     * @param contact
     */
    public void call(String contact) {
        System.out.println("Go to the phone book, find " + contact + " and call");
    }

    /**
     * Create method createMail.
     *
     * @param mail
     * @return
     */
    public String createMail(String mail) {
        System.out.println("Create message: " + mail);
        return null;
    }

    /**
     * Create method sendMail.
     *
     * @param mail
     */
    public void sendMail(String mail) {
        System.out.println("Send massage: " + mail);
    }

    /**
     * Create method editMail.
     *
     * @param mail
     * @return
     */
    public String editMail(String mail) {
        System.out.println("Edit massege: " + mail);
        return null;
    }
}

