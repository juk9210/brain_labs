package ua.zp.brain.labs.oop.basics.packages.citizen;

public class PassportUtil {
    public static void Registration(Passport male, Passport female) {
        male.setSpouseID(female.getId());
        female.setSpouseID(male.getId());
    }

    private PassportUtil() {
        System.out.println("closed constructor");
    }
}