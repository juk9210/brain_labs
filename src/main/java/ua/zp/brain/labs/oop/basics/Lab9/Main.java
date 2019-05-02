package ua.zp.brain.labs.oop.basics.Lab9;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println("Circumference: " + circle.getCircumference() + "\tSquare: " + circle.getSquare() + "\tColour: "
                + circle.getColour());
    }
}
