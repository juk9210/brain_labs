package ua.zp.brain.labs.oop.basics.lab14;

public class Manager extends Employee {
    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    void consult() {
        System.out.println("Manager advises the client");
    }

    void discounts() {
        System.out.println("Manager talks about discounts");
    }

    void advise() {
        System.out.println("Manager advises the client");
    }

    @Override
    void toDoWork() {
        System.out.println("The manager puts the goods on the shelves");
    }
}
