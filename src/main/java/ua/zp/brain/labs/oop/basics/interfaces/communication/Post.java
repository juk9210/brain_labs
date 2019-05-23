package ua.zp.brain.labs.oop.basics.interfaces.communication;

public class Post implements MailSender {
    public String createMail(String mail) {
        System.out.println("Create message: "+mail);
        return null;
    }

    public void sendMail(String mail) {
        System.out.println("Send massage: "+mail);
    }
}
