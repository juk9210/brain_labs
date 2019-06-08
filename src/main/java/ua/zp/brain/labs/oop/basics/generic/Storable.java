package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create interface Storable with generic.
 *
 * @param <S>
 * @author Shakhov Yevhen.
 */

interface Storable<S> {
    /**
     * Create method read with data type - S.
     *
     * @return
     */
    S read();

    /**
     * Create method write with parameter data.
     *
     * @param data
     */
    void write(S data);

    /**
     * Create method getType with data type - Type.
     *
     * @return
     */
    Type getType();
}
