package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create class NumericData which extends AbstractData and implements Storable.
 *
 * @author Shakhov Yevhen.
 */


class NumericData extends AbstractData implements Storable<Number> {
    /**
     * Create final field  - type,private field Number data.And get of data.
     */
    final Type type = Type.NUM;
    private Number data;

    public Number getData() {
        return data;
    }

    /**
     * Create constructor with parameter - id.
     *
     * @param id
     */
    NumericData(long id) {
        super(id);
    }

    /**
     * Override method convertToString which return data converted to string.
     *
     * @return
     */
    @Override
    String convertToString() {
        return String.valueOf(getData());
    }

    /**
     * Override method read.
     *
     * @return
     */
    @Override
    public Number read() {
        return null;
    }

    /**
     * Override method write.
     *
     * @param data
     */
    @Override
    public void write(Number data) {

    }

    /**
     * Override method getType.
     *
     * @return
     */
    @Override
    public Type getType() {
        return null;
    }

    /**
     * Override method toString.
     * @return
     */
    @Override
    public String toString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }
}
