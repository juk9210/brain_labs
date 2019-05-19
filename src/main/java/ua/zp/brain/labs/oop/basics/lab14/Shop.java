package ua.zp.brain.labs.oop.basics.lab14;

public class Shop {
    String name;
    String adress;
    Client cl1;
    Manager m1;
    Cashier c1;
    SecurityGuard s1;

    void open() {
        System.out.println("The shop opens");
    }

    void lunch() {
        System.out.println("Employees go to dinner");
    }

    void sell() {
        System.out.println("Managers sell goods");
    }

    public static void main(String[] args) {
        Shop arber = new Shop();
        arber.open();
        arber.m1.comeToWork();


    }
}
