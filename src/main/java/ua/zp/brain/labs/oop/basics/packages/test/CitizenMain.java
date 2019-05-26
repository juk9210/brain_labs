package ua.zp.brain.labs.oop.basics.packages.test;

import ua.zp.brain.labs.oop.basics.packages.citizen.Passport;
import ua.zp.brain.labs.oop.basics.packages.citizen.PassportUtil;

/**
 * In main method create class instance of class citizen.Passport.
 * And display on data.
 *
 * @author Shakhov Yevhen.
 */

public class CitizenMain {
    public static void main(String[] args) {
        Passport yevhen = new Passport();
        yevhen.setId(156165);
        Passport anastasiia = new Passport();
        anastasiia.setId(5189115);
        System.out.println(yevhen.getSpouseID() + " " + anastasiia.getSpouseID());
        PassportUtil.marriageRegistrate(yevhen, anastasiia);
        System.out.println(yevhen.getSpouseID() + " " + anastasiia.getSpouseID());
    }
}
