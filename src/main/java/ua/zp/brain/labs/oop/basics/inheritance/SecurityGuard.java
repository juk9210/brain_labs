package ua.zp.brain.labs.oop.basics.inheritance;

/**
 * Create class SecurityGuard which extends class Employee.
 *
 * @author Shakhov Yevhen.
 */

class SecurityGuard extends Employee {
    /**
     * Create method talk.
     */
    private void talk() {
        System.out.println("The guard is talking on the radio");
    }

    /**
     * Override method toDoWork.
     */
    @Override
    void toDoWork() {
        System.out.println("Security guard watching customers");
        talk();
    }

    /**
     * Override method toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "SecurityGuard{}";
    }

    /**
     * Create constructor with options.
     *
     * @param name
     * @param numberPhone
     * @param salary
     * @param dateOfReceipt
     * @param prusence
     */
    SecurityGuard(String name, int numberPhone, int salary, String dateOfReceipt, String prusence) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
    }
}
