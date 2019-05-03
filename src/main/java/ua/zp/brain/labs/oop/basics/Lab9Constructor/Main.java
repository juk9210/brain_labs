package ua.zp.brain.labs.oop.basics.Lab9Constructor;

/**
 * Create a class object of Circle.Set the parameters.
 * And display the object data in the console
 *
 * @author Shakhov Yevhen.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15, "red");
        System.out.println("Circumference: " + circle.getCircumference() + "\tSquare: " + circle.getSquare() + "\tColour: "
                + circle.getColour());
    }
}
