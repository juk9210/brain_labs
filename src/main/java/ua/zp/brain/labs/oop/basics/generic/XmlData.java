package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create class XmlData which extends AbstractData and implements Storable.
 *
 * @author Shakhov Yevhen.
 */

class XmlData extends AbstractData implements Storable<String> {
    /**
     * Create final field  - type,private field String data.And get of data.
     */
    final Type type = Type.XML;
    private String data;

    public String getData() {
        return data;
    }

    /**
     * Create constructor with parameter - id.
     *
     * @param id
     */
    XmlData(long id) {
        super(id);
    }

    /**
     * Override method convertToString which return getData.
     *
     * @return
     */
    @Override
    String convertToString() {
        return getData();
    }

    /**
     * Override method read.
     *
     * @return
     */
    @Override
    public String read() {
        return null;
    }

    /**
     * Override method write.
     *
     * @param data
     */
    @Override
    public void write(String data) {

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
