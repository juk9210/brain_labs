package ua.zp.brain.labs.oop.basics.generic;

import java.util.Arrays;

/**
 * Create class BinaryData which extends AbstractData and implements Storable.
 *
 * @author Shakhov Yevhen.
 */
class BinaryData extends AbstractData implements Storable<byte[]> {
    /**
     * Create final field  - type,private field byte[] data.And get of data.
     */
    final Type type = Type.BIN;
    private byte[] data;

    public byte[] getData() {
        return data;
    }

    /**
     * Create constructor with parameter - id.
     *
     * @param id
     */
    BinaryData(long id) {
        super(id);
    }

    /**
     * Override method convertToString which return data converted to string.
     *
     * @return
     */
    @Override
    String convertToString() {
        return Arrays.toString(getData());
    }

    /**
     * Override method read.
     *
     * @return
     */
    @Override
    public byte[] read() {
        return new byte[0];
    }

    /**
     * Override method write.
     *
     * @param data
     */
    @Override
    public void write(byte[] data) {

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
}
