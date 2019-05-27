package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create class Post which implements MailSender.
 *
 * @author Shakhov Yevhen.
 */

public class Post implements MailSender {
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
}
