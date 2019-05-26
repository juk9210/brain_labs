package ua.zp.brain.labs.oop.basics.packages.technics;

import java.util.Date;

/**
 * Create class Util with static method.
 *
 * @author Shakhov Yevhen.
 */

public class PassportUtil {
    public static void warrantyReplace(Passport warranty) {
        warranty.setWarrantyStartDate(new Date());

    }
}
