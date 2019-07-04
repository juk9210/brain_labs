package ua.zp.brain.labs.oop.basics.multithreading;

/**
 * @author Shakhov Yevhen.
 */

class Car {
    private String name;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
}
