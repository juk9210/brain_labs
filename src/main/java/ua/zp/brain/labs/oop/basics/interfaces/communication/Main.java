package ua.zp.brain.labs.oop.basics.interfaces.communication;

public class Main {
    public static void main(String[] args) {
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

        sendAll(nokia,ukr);
    }
static void sendAll(MailSender ... send){
        for(MailSender s : send){
            s.sendMail("Hello");
        }
}
}
