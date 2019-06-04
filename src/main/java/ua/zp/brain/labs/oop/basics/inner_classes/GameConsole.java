package ua.zp.brain.labs.oop.basics.inner_classes;

/**
 * Create class GameConsole.
 *
 * @author Shakhov Yevhen.
 */

class GameConsole {
    /**
     * Describe the fields.Create enums for all possible fields.Fields that will not change denote final and create get.
     * For others create get/set.
     */
    private final Brand brand;
    private final Model model;
    private final Serial serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn = true;

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Serial getSerial() {
        return serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public void setFirstGamepad(Gamepad firstGamepad) {
        this.firstGamepad = firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public void setSecondGamepad(Gamepad secondGamepad) {
        this.secondGamepad = secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    /**
     * Create constructor with parameters.Also,create and assign two joysticks.
     *
     * @param brand
     * @param serial
     * @param model
     */
    GameConsole(Brand brand, Model model, Serial serial) {
        this.brand = brand;
        this.serial = serial;
        this.model = model;
        Gamepad firstGamepad = new Gamepad(brand, 1);
        Gamepad secondGamepad = new Gamepad(brand, 2);
    }

    /**
     * Create inner class Gamepad with fields.Create enums for all possible fields.Fields that will not change
     * denote final and create get.For others create get/set.
     */
    class Gamepad {
        private final Brand brand;
        private final Serial consoleSerial;
        private final int connectedNumber;
        private Color color;
        private double chargeLevel = 100.0;
        private boolean isOn;

        public Brand getBrand() {
            return brand;
        }

        public Serial getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        /***
         * Create constructor with parameters. Field consoleSerial assign value field serial.
         * @param brand
         * @param connectedNumber
         */
        Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;

        }
    }
}
