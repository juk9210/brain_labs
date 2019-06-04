package ua.zp.brain.labs.oop.basics.abstracts.devices;

/**
 * Create class Test.
 *
 * @author Shakhov Yevhen.
 */

class Test {
    /**
     * Create method main.
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
          Create instance of class SmartPhone and organize the work of the class instance.
         */
        SmartPhone samsung = new SmartPhone(2, "TFT", "Android");
        samsung.setName("Samsung");
        samsung.setSerial(151981);
        System.out.println("Smartphone - " + samsung.getName() + " has a serial: " + samsung.getSerial() + ", a simcount: " +
                samsung.getDisplay() + ", a OS: " + samsung.getOs() + ". And his work: \n");
        samsung.powerOn();
        samsung.call();
        samsung.runApp();
        samsung.powerOff();
        System.out.println();
        /*
          Create instance of class DialPhone and organize the work of the class instance.
         */
        DialPhone saturn = new DialPhone(true);
        saturn.setName("Saturn");
        saturn.setSerial(8657);
        System.out.println("Dialphone - " + saturn.getName() + " has a serial: " + saturn.getSerial() + ". And his work: \n");
        saturn.powerOn();
        saturn.call();
        saturn.autoAnswer();
        saturn.powerOff();
        System.out.println();
        /*
          Create instance of class Multicooker and organize the work of the class instance.
         */
        Multicooker lg = new Multicooker();
        lg.setName("LG");
        lg.setSerial(354345);
        System.out.println("Multicooker - " + lg.getName() + " has a serial: " + lg.getSerial() + ". And his work: \n");
        lg.powerOn();
        lg.switchProgram(5);
        lg.cook();
        lg.powerOff();
        System.out.println();
        /*
          Create instance of class Oven and organize the work of the class instance.
         */
        Oven azov = new Oven();
        azov.setName("Azov");
        azov.setSerial(16516);
        System.out.println("Oven - " + azov.getName() + " has a serial: " + azov.getSerial() + ". And his work: \n");
        azov.powerOn();
        azov.initTimer(30);
        azov.cook();
        azov.powerOff();
        System.out.println();
        /*
         Implement the method offAll.
         */
        offAll(samsung, lg, azov, saturn);
    }

    /**
     * Create static method offAll which turns off all devices.
     *
     * @param devices
     */
    static void offAll(AbstractDevice... devices) {
        for (AbstractDevice d : devices) {
            d.powerOff();
        }
    }

}