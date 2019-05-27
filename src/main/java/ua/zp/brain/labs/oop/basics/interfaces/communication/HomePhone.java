package ua.zp.brain.labs.oop.basics.interfaces.communication;

/**
 * Create class HomePhone which implements Caller.
 *
 * @author Shakhov Yevhen.
 */

class HomePhone implements Caller {
    /**
     * Create method call.
     *
     * @param contact
     */
    public void call(String contact) {
        System.out.println("Pick up the phone,dial the number and call - " + contact);
    }
}
