package ua.zp.brain.labs.oop.basics.interfaces.communication;

interface MailSender {

    String createMail(String mail);

    void sendMail(String mail);
}
