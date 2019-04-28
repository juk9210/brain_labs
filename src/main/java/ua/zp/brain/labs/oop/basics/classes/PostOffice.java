package ua.zp.brain.labs.oop.basics.classes;

/**
 *
 */
public class PostOffice {
    public int branchNumber;
    public String own;

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    public static String getLOCALIZATION() {
        return LOCALIZATION;
    }

    public static final String LOCALIZATION = "regional";

}
