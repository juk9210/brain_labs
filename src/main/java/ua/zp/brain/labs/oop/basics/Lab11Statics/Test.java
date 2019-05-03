package ua.zp.brain.labs.oop.basics.Lab11Statics;
/**
 * Check methods of class MathUtil
 *
 * @author Shakhov Yevhen.
 */

import static ua.zp.brain.labs.oop.basics.Lab11Statics.MathUtil.*;

public class Test {

    public static void main(String[] args) {

        /*Part1
          Check methods - sum and mul repeatedly.
         */
        System.out.println("Sum of values: " + sum(3, 3, 5, 10));
        System.out.println("Sum of values: " + sum(3, 5, 7, 1));
        System.out.println("Multiply of values: " + mul(1, 1, 5, 10));
        System.out.println("Multiply of values: " + mul(2, 4, 1, 5));
        System.out.println("Multiply of values: " + mul(4, 1, 7, 2));
        /*Part2
          Check methods - printWithSkip and printToValue repeatedly.
         */
        System.out.print("Print with skipping: ");
        printWithSkip(1, 1, 5, 10, 1, 2, 1, 5, 1, 8, 8);
        System.out.println();
        System.out.print("Print with skipping: ");
        printWithSkip(5, 2, 5, 4, 7, 1, 3, 1, 5);
        System.out.println();
        System.out.print("Print with interrupt: ");
        printToValue(15, 1, 5, 10, 1, 2, 1, 15, 1, 8, 8);
        System.out.println();
        System.out.print("Print with interrupt: ");
        printToValue(2, 4, 5, 7, 2, 9, 15, 245, 4546);
        System.out.println();

        /*Part 3
        Check methods - factorial,harmonicProgression  and arithmeticProgression repeatedly.
         */
        System.out.println("Factorial of value: " + factorial(3));
        System.out.println("Factorial of value: " + factorial(0));
        System.out.println("Factorial of value: " + factorial(6));
        System.out.println("Harmonic progression: " + harmonicProgression(2, 4, 2));
        System.out.println("Harmonic progression: " + harmonicProgression(3, 2, 4));
        System.out.println("Harmonic progression: " + harmonicProgression(2, 4, 5));
        System.out.println("Arithmetic progression: " + arithmeticProgression(2, 4, 3));
        System.out.println("Arithmetic progression: " + arithmeticProgression(3, 5, 6));
        System.out.println("Arithmetic progression: " + arithmeticProgression(4, 2, 3));
    }
}
