package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create interface EmailSender which extends class MailSender.
 *
 * @author Shakhov Yevhen.
 */

public interface EmailSender extends MailSender {
    /**
     * Create method editMail.
     *
     * @param mail
     * @return
     */

    String editMail(String mail);

}
