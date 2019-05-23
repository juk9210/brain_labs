package ua.zp.brain.labs.oop.basics.interfaces.communication;

class SmartPhone implements Caller, EmailSender {
    public void call(String contact) {
        System.out.println("Go to the phone book, find "+contact+" and call");
    }

    public String createMail(String mail) {
        System.out.println("Create message: "+mail);
        return null;
    }

    public void sendMail(String mail) {
        System.out.println("Send massage: "+mail);
    }

    public String editMail(String mail) {
        System.out.println("Edit massege: "+mail);
        return mail;
    }
}

