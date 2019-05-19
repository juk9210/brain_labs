package ua.zp.brain.labs.oop.basics.packages.test;

import ua.zp.brain.labs.oop.basics.packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport tr2 = new Passport();
        tr2.setOwnerName("Yevhen");
        System.out.println(tr2.getOwnerName());
        Passport tr3 = tr2.changeOwner("Anastasiia");
        System.out.println(tr2.getOwnerName());
    }
}
