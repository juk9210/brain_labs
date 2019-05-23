package ua.zp.brain.labs.oop.basics.interfaces.communication;

class HomePhone implements Caller {
    public void call(String contact) {
        System.out.println("Pick up the phone,dial the number and call - "+contact);
    }
}
