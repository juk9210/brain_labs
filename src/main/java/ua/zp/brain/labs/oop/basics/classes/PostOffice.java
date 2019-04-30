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

    public void accept() {
        System.out.println("Reception parcel list");
    }

    public void packAndShip() {
        System.out.println("Packing and shipping parcel list");
    }

    public static void volumeCalculation() {
        double length = 5;
        double height = 15;
        double width = 7;
        double volume = length * height * width / 5000;
        System.out.println("Volume weight of parcel: " + volume);
    }
}
