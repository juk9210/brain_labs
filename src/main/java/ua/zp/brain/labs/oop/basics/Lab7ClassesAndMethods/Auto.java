package ua.zp.brain.labs.oop.basics.Lab7ClassesAndMethods;

/**
 * Create class Auto.Describe private fields and we create methods.
 * *@author Shakhov Yevhen.
 */
class Auto {
    private String typeOfTransport;
    private String bodyType;
    private String countryProducer;
    private String brand;
    private String model;
    private int yearOfRelease;
    private String color;
    //Add a field with a constant
    private static final String DRIVE_TYPE = "automaton";

    // Add for private fields do get / set
    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getCountryProducer() {
        return countryProducer;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getDriveType() {
        return DRIVE_TYPE;
    }

    //Add methods for this class.
    public void turnOn() {
        System.out.println("Turn on headlights");
    }

    public void brake() {
        System.out.println("Stop the car");
    }

    public void go() {
        System.out.println("Go by car");
    }
}
