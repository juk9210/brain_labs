package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create abstract class AbstractData.
 *
 * @author Shakhov Yevhen.
 */

abstract class AbstractData {
    /**
     * Describe private field - id.Create get for field.
     */
    private long id;

    public long getId() {
        return id;
    }

    /**
     * Create constructor with parameter - id.
     *
     * @param id
     */
    AbstractData(long id) {
        this.id = id;
    }

    /**
     * Create abstract method.
     *
     * @return
     */
    abstract String convertToString();
}
