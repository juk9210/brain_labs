package ua.zp.brain.labs.oop.basics.lab14;

public class Cashier extends Employee {
    int cashNumber;

    void count() {
        System.out.println("The cashier counts the money");
    }

    @Override
    void toDoWork() {
        System.out.println("The cashier recounts the cashier");
    }
}
