package ua.zp.brain.labs.oop.basics.packages.transport;

public class PassportUtil {
    static Passport changeOwner(String newOwner, Passport oldPassport) {
        Passport passport = new Passport();
        passport.setOwnerName(newOwner);
        passport.setHorsePower(oldPassport.getHorsePower());
        passport.setTransportName(oldPassport.getTransportName());
        return passport;
    }

}
