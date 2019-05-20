package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

public class Cashier extends Employee {
    private int cashNumber;

    private void count() {
        System.out.println("The cashier counts the money");
    }

    @Override
    void toDoWork() {
        System.out.println("The cashier recounts the cashier");
        count();
    }

    public int getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(int cashNumber) {
        this.cashNumber = cashNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier)) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return cashNumber == cashier.cashNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashNumber);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashNumber=" + cashNumber +
                '}';
    }

    Cashier(String name, int numberPhone, int salary, String dateOfReceipt, String prusence, int cashNumber) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
        this.cashNumber = cashNumber;
    }
}
