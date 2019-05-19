package ua.zp.brain.labs.oop.basics.lab14;

public class SecurityGuard extends Employee {
    void talk() {
        System.out.println("The guard is talking on the radio");
    }

    @Override
    void toDoWork() {
        System.out.println("Security guard watching customers");
    }
}
