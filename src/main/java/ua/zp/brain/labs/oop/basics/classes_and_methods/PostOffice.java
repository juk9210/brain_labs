package ua.zp.brain.labs.oop.basics.classes_and_methods;

/**
 * Create class PostOficce.Describe private fields and we create methods.
 *
 * @author Shakhov Yevhen.
 */
class PostOffice {
    private int branchNumber;
    private String own;
    //Add a field with a constant
    private static final String LOCALIZATION = "regional";

    // Add for private fields do get / set
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

    //Add methods for this class.
    void accept() {
        System.out.println("Reception parcel list");
    }

    void packAndShip() {
        System.out.println("Packing and shipping parcel list");
    }

    //Create a static method for calculating the volume of the parcel
    static void volumeCalculation() {
        double length = 5;
        double height = 15;
        double width = 7;
        double volume = (length * height * width / 5000);
        System.out.println("Volume weight of parcel: " + volume);
    }
}
