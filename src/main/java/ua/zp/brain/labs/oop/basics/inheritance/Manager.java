package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

/**
 * Create class Manager which extends class Employee.
 *
 * @author Shakhov Yevhen.
 */

class Manager extends Employee {
    /**
     * Create private field with get/set.
     */
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Create methods - consult, discounts and advise.
     */
    private void consult() {
        System.out.println("Manager advises the client");
    }

    private void discounts() {
        System.out.println("Manager talks about discounts");
    }

    private void advise() {
        System.out.println("Manager advises the client");
    }

    /**
     * Override method toDoWork.
     */
    @Override
    void toDoWork() {
        System.out.println("Manager puts the goods on the shelves");
        consult();
        discounts();
        advise();
    }

    /**
     * Override method equals.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    /**
     * Override method hashCode.
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    /**
     * Override method toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Manager{" +
                "departement='" + department + '\'' +
                '}';
    }

    /**
     * Create constructor with options.
     *
     * @param name
     * @param numberPhone
     * @param salary
     * @param dateOfReceipt
     * @param prusence
     * @param departement
     */
    Manager(String name, int numberPhone, int salary, String dateOfReceipt, String prusence, String departement) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
        this.department = departement;
    }
}
