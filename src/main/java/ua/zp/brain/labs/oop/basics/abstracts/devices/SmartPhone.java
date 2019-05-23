package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class SmartPhone extends Mobile {
    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    void runApp() {
        System.out.println("Run the app");
    }

    SmartPhone(int simCount, String display, String os) {
        super(simCount, display);
        this.os = os;
    }

}
