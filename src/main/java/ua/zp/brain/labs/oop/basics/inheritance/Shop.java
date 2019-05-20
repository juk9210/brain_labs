package ua.zp.brain.labs.oop.basics.inheritance;

public class Shop {
    private String nameOfShop;
    private String address;
    private Client cl1;
    private Manager m1;
    private Cashier c1;
    private SecurityGuard s1;

    private void open() {
        System.out.println("The shop opens");
    }

    private void lunch() {
        System.out.println("Shop closes for lunch");
    }

    void sell() {
        System.out.println("Managers sell goods");
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Client getCl1() {
        return cl1;
    }

    public void setCl1(Client cl1) {
        this.cl1 = cl1;
    }

    public Manager getM1() {
        return m1;
    }

    public void setM1(Manager m1) {
        this.m1 = m1;
    }

    public Cashier getC1() {
        return c1;
    }

    public void setC1(Cashier c1) {
        this.c1 = c1;
    }

    public SecurityGuard getS1() {
        return s1;
    }

    public void setS1(SecurityGuard s1) {
        this.s1 = s1;
    }

    private Shop(Manager m1, Client cl1, Cashier c1, SecurityGuard s1) {
        this.m1 = m1;
        this.cl1 = cl1;
        this.c1 = c1;
        this.s1 = s1;
    }

    public static void main(String[] args) {
        Client Bogdan = new Client("Bogdan", 665841542, 2154, 1520);
        Manager Ann = new Manager("Ann", 508412541, 3500, "10.01.2017",
                "yes", "Men's clothing");
        Cashier Svetlana = new Cashier("Svetlana", 972541530, 2800, "25.05.2019",
                "yes", 5);
        SecurityGuard Oleg = new SecurityGuard("Oleg", 502582917, 3000, "9.04.2015",
                "yes");

        Shop ar1 = new Shop(Ann, Bogdan, Svetlana, Oleg);
        ar1.setNameOfShop("Arber");
        System.out.println("The name of shop - " + ar1.getNameOfShop());
        ar1.open();
        System.out.print(Ann.getName() + " ");
        Ann.comeToWork();
        System.out.print(Svetlana.getName() + " ");
        Svetlana.comeToWork();
        System.out.print(Oleg.getName() + " ");
        Oleg.comeToWork();
        System.out.println();

        System.out.print(Bogdan.getName() + " asks the manager: ");
        Bogdan.discover();
        Ann.toDoWork();
        System.out.print(Bogdan.getName() + " says: ");
        Bogdan.buy();
        Svetlana.toDoWork();
        Oleg.toDoWork();
        System.out.println();

        ar1.lunch();
        System.out.print(Ann.getName() + " ");
        Ann.goForLunch();
        System.out.print(Svetlana.getName() + " ");
        Svetlana.goForLunch();
        System.out.print(Oleg.getName() + " ");
        Oleg.goForLunch();
        System.out.println();

        System.out.println("hashCode of Ann: " + Ann.hashCode());
        System.out.println("hashCode of Bogdan: " + Bogdan.hashCode());
        System.out.println(Ann.equals(Bogdan));
        System.out.println(Ann.toString());
        System.out.println(Bogdan.toString());


    }
}
