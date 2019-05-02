package ua.zp.brain.labs.oop.basics.Lab9;

/**
 *
 */
public class Circle {
    private double radius;
    private double circumference;
    private double square;
    private String colour;

    Circle(double radius) {
        this.radius = radius;
        square = Math.PI*Math.pow(radius,2);
        circumference = 2*Math.PI*radius;
    }

    Circle(double radius, String colour) {
        this(radius);
        this.colour = colour;
        square = Math.PI*Math.pow(radius,2);
        circumference = 2*Math.PI*radius;
    }

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
