package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create interface MailSender.
 *
 * @author Shakhov Yevhen.
 */

interface MailSender {
    /**
     * Create methods - createMail and sendMail.
     *
     * @param mail
     * @return
     */

    String createMail(String mail);

    void sendMail(String mail);
}
