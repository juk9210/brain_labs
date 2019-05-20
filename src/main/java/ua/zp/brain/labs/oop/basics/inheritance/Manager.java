package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

public class Manager extends Employee {
    private String department;

    private void consult() {
        System.out.println("Manager advises the client");
    }

    private void discounts() {
        System.out.println("Manager talks about discounts");
    }

    private void advise() {
        System.out.println("Manager advises the client");
    }

    @Override
    void toDoWork() {
        System.out.println("Manager puts the goods on the shelves");
        consult();
        discounts();
        advise();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "departement='" + department + '\'' +
                '}';
    }

   Manager(String name, int numberPhone, int salary, String dateOfReceipt, String prusence, String departement) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
        this.department = departement;
    }
}
