package ua.zp.brain.labs.oop.basics.packages.citizen;

/**
 * Create class - Passport with private fields,and their get/set.
 * @author Shakhov Yevhen.
 */
public class Passport {
    private String name;
    private int id;
    private int spouseID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpouseID() {
        return spouseID;
    }

    void setSpouseID(int spouseID) {
        this.spouseID = spouseID;
    }
}