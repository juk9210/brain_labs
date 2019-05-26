package ua.zp.brain.labs.oop.basics.packages.citizen;

/**
 * Create class Util with static method and constructor.
 *
 * @author Shakhov Yevhen.
 */
public class PassportUtil {
    public static void marriageRegistrate(Passport male, Passport female) {
        male.setSpouseID(female.getId());
        female.setSpouseID(male.getId());
    }

    private PassportUtil() {
        System.out.println("closed constructor");
    }
}