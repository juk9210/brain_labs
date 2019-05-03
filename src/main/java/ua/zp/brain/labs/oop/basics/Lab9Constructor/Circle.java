package ua.zp.brain.labs.oop.basics.Lab9Constructor;

/**
 * Create a class Circle
 * Describe private fields. For fields we do get/set
 * Create two constructors with different parameters.
 *
 * @author Shakhov Yevhen.
 */
public class Circle {
    //Describe private fields
    private double radius;
    private double circumference;
    private double square;
    private String colour;

    //Create constructor with parameter radius.Calculate the square and the circumference
    Circle(double radius) {
        this.radius = radius;
        square = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
    }

    //Create constructor with parameter radius and colour.Calculate the square and the circumference
    Circle(double radius, String colour) {
        this(radius);
        this.colour = colour;
        square = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
    }

    // For fields we do get/set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
