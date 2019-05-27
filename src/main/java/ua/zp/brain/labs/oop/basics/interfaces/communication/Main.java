package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create class main.
 *
 * @author Shakhov Yevhen.
 */

public class Main {
    /**
     * Create method main.
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Create instances of classes.Describe work of instances of classes.
         */
        SmartPhone nokia = new SmartPhone();
        nokia.call("Andry");
        nokia.createMail("Hello Andry.How are you?");
        nokia.sendMail("Push the button - send");
        nokia.editMail("Hello Andry.You are home?");
        System.out.println();

        HomePhone hp = new HomePhone();
        hp.call("Michail");
        System.out.println();

        Post ukr = new Post();
        ukr.createMail("I am home");
        ukr.sendMail("Roll in an envelope and send");
        System.out.println();

        sendAll(nokia, ukr);
    }

    /**
     * Create static method sendMail.
     *
     * @param send
     */
    static void sendAll(MailSender... send) {
        for (MailSender s : send) {
            s.sendMail("Hello");
        }
    }
}
