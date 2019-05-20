package ua.zp.brain.labs.oop.basics.inheritance;

public class SecurityGuard extends Employee {
    private void talk() {
        System.out.println("The guard is talking on the radio");
    }

    @Override
    void toDoWork() {
        System.out.println("Security guard watching customers");
        talk();
    }

    @Override
    public String toString() {
        return "SecurityGuard{}";
    }

    SecurityGuard(String name, int numberPhone, int salary, String dateOfReceipt, String prusence) {
        super(name, numberPhone, salary, dateOfReceipt, prusence);
    }
}
