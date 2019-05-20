package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

public class Employee extends Human {
    private String dateOfReceipt;
    private int salary;
    private String prusence;

    void comeToWork() {
        System.out.println("comes to work");
    }


    void goForLunch() {
        System.out.println("goes to dinner");
    }

    void toDoWork() {
        System.out.println("does his job");
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPrusence() {
        return prusence;
    }

    public void setPrusence(String prusence) {
        this.prusence = prusence;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(dateOfReceipt, employee.dateOfReceipt) &&
                Objects.equals(prusence, employee.prusence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfReceipt, salary, prusence);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dateOfReceipt='" + dateOfReceipt + '\'' +
                ", salary=" + salary +
                ", prusence='" + prusence + '\'' +
                '}';
    }

    Employee(String name, int numberPhone, int salary, String dateOfReceipt, String prusence) {
        super(name, numberPhone);
        this.dateOfReceipt = dateOfReceipt;
        this.prusence = prusence;
        this.salary = salary;
    }
}
