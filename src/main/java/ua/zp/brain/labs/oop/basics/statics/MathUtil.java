package ua.zp.brain.labs.oop.basics.statics;

/**
 * Simple class with static methods, for demonstrate working with cycles in Java.
 * Help to calc several math sequences.
 *
 * @author Shakhov Yevhen.
 */
class MathUtil {

    /**
     * Sum of several values.
     *
     * @param values values sequence
     * @return sum result.
     */
    static int sum(int... values) {
        int result = 0;
        for (int a : values) {
            result += a;
        }
        return result;
    }

    /**
     * Multiply of several values.
     *
     * @param values values sequence
     * @return multiply result.
     */
    static int mul(int... values) {
        int result = 1;
        for (int a : values) {
            result *= a;
        }
        return result;
    }

    /**
     * Print all numbers unless {@param interrupt }
     *
     * @param skipValue skipped value
     * @param values    values sequence
     */
    static void printWithSkip(int skipValue, int... values) {
        for (int a : values) {
            if (a == skipValue) {
                continue;
            }
            System.out.print(a + " ");
        }
    }

    /**
     * Print all numbers before reaching {@param interrupt }
     *
     * @param interruptValue force end value
     * @param values         values sequence
     */
    static void printToValue(int interruptValue, int... values) {
        for (int a : values) {
            if (a == interruptValue) {
                break;
            }
            System.out.print(a + " ");
        }
    }

    /**
     * Calc factorial value.
     *
     * @param a factorial value.
     * @return factorial result of {@param a}.
     */
    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Calc harmonic progression for value with ratio.
     *
     * @param a     base value
     * @param q     ratio
     * @param count calc count
     * @return harmonic progression result.
     */
    static int harmonicProgression(int a, int q, int count) {
        int result = a;
        for (int i = 0; i < count - 1; i++) {
            result *= q;
        }
        return result;
    }

    /**
     * Calc harmonic arithmetic for value with ratio.
     *
     * @param a     base value
     * @param q     ratio
     * @param count calc count
     * @return arithmetic progression result.
     */
    static int arithmeticProgression(int a, int q, int count) {
        int result = a;
        for (int i = 0; i < count - 1; i++) {
            result = result + q;
        }
        return result;
    }

    private MathUtil() {
        // Denied to create instance of this class
    }
}
