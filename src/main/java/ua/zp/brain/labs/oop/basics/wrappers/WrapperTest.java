package ua.zp.brain.labs.oop.basics.wrappers;

/**
 * In main method create operations with wrappers.
 *
 * @author Shakhov Yevhen.
 */

public class WrapperTest {
    public static void main(String[] args) {
        Integer a1 = 20;
        Long b1 = 4000L;
        Float c1 = 4.18f;
        Double d1 = 1.24;
        Boolean isTrue1 = true;
        Character e1 = 'F';
        Byte f1 = 2;

        Integer a2 = Integer.valueOf(20);
        Long b2 = Long.valueOf(4000L);
        Float c2 = Float.valueOf(4.18f);
        Double d2 = Double.valueOf(1.24);
        Boolean isTrue2 = Boolean.valueOf(true);
        Character e2 = Character.valueOf('F');
        Byte f2 = Byte.valueOf((byte) 2);

        Integer a3 = new Integer(20);
        Long b3 = new Long(4000L);
        Float c3 = new Float(4.18f);
        Double d3 = new Double(1.24);
        Boolean isTrue3 = new Boolean(false);
        Character e3 = new Character('F');
        Byte f3 = new Byte((byte) 2);

        Integer a4 = Integer.parseInt("20");
        Long b4 = Long.parseLong("500000L");
        Float c4 = Float.parseFloat("4.18");
        Double d4 = Double.parseDouble("1.24");
        Boolean isTrue4 = Boolean.parseBoolean("False");
        Byte f4 = Byte.parseByte("2");

        Double got = Double.valueOf(25.58);
        byte i1 = 9;
        int i2 = 100;
        long i3 = 750L;
        short i4 = 33;
        float i5 = 3.5f;
        i1 = (byte) got.doubleValue();
        i2 = (int) got.doubleValue();
        i3 = (long) got.doubleValue();
        i4 = (short) got.doubleValue();
        i5 = (float) got.doubleValue();

        Double j1 = 5.75;
        Double j2 = 0.0;
        Double nanValue = j1 / j2;
        Double infinityValue = j2 / j2;
        System.out.println(nanValue);
        System.out.println(infinityValue);
        //Boolean isBad = nanValue == null || Double.isInfinite(infinityValue) ||
        if (Double.isInfinite(infinityValue)) {
            System.out.println("infinitive");
        }
        if (Double.isNaN(nanValue)) {
            System.out.println("NaN");
        }
    }
}
