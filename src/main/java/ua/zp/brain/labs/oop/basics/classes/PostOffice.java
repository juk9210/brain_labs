package ua.zp.brain.labs.oop.basics.classes;

/**
 *
 */
public class PostOffice {
    private int branchNumber;
    private String own;
    private static final String LOCALIZATION = "regional";

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

}
