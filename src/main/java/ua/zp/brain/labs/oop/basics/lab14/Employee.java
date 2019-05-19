package ua.zp.brain.labs.oop.basics.lab14;

public class Employee extends Human {
    String dateOfReceipt;
    int salary;
    String prusence;

    void comeToWork() {
        System.out.println("Employee comes to work");
    }


    void goForLunch() {
        System.out.println("Employee goes to work");
    }

    void toDoWork() {
        System.out.println("Employee does his job");
    }

}
