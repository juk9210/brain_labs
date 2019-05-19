package ua.zp.brain.labs.oop.basics.lab14;

public class Shop {
    private String name;
    private String adress;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    Shop(Manager m1, Client cl1, Cashier c1, SecurityGuard s1) {
        this.m1 = m1;
        this.cl1 = cl1;
        this.c1 = c1;
        this.s1 = s1;
    }

    Shop(Client cl1) {
        this.cl1 = cl1;
    }

    public static void main(String[] args) {
        String name = "Arber";
        System.out.println("The name of shop - " + name);
        Client Bogdan = new Client();
        Bogdan.setDiscountCard(285275);
        Bogdan.setAmountOfMoney(550);
        Manager Ann = new Manager();
        Ann.setDepartement("Men's clothing department");
    }
}
