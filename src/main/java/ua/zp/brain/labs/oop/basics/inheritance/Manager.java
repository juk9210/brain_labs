package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

public class Manager extends Employee {
    private String departement;

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
        System.out.println("Manager puts the goods on the shelves");
        consult();
        discounts();
        advise();
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(departement, manager.departement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departement);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "departement='" + departement + '\'' +
                '}';
    }

   Manager(String name, int numberPhone, int salary, String dateOfReceipt, String prusence, String departement) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
        this.departement = departement;
    }
}
