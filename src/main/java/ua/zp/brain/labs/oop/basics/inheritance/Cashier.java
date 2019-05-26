package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

/**
 * Create class Cashier which inherits class Employee.
 *
 * @author Shakhov Yevhen.
 */

public class Cashier extends Employee {
    /**
     * Create private field with get/set.
     */
    private int cashNumber;

    public int getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(int cashNumber) {
        this.cashNumber = cashNumber;
    }

    /**
     * Create private method.
     */
    private void count() {
        System.out.println("The cashier counts the money");
    }

    /**
     * Override method toDoWork.
     */
    @Override
    void toDoWork() {
        System.out.println("The cashier recounts the cashier");
        count();
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
        if (!(o instanceof Cashier)) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return cashNumber == cashier.cashNumber;
    }

    /**
     * Override method hashCode.
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashNumber);
    }

    /**
     * Override method toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cashier{" +
                "cashNumber=" + cashNumber +
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
     * @param cashNumber
     */
    Cashier(String name, int numberPhone, int salary, String dateOfReceipt, String prusence, int cashNumber) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
        this.cashNumber = cashNumber;
    }
}
