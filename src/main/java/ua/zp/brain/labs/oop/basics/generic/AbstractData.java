package ua.zp.brain.labs.oop.basics.generic;

/**
 * @author Shakhov Yevhen.
 */

class AbstractData {
    private long id;
    AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
