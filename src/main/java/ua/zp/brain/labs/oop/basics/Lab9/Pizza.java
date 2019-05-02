package ua.zp.brain.labs.oop.basics.Lab9;

/**
 *
 */
public class Pizza {
    private String name;
    private String composition;
    private double cost;
    private Circle basis;

    Pizza(String name, String composition, double cost, double diametr) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        Circle circle = new Circle(diametr);
        System.out.println(name+" "+composition+" "+cost+" "+diametr);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }
}
