package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create class StringData which extends AbstractData.
 *
 * @author Shakhov Yevhen.
 */

class StringData extends AbstractData {
    /**
     * Describe private fields - data and type.Create get for fields.For field of type indicate data type - Type.And
     * create enum Type.
     */
    private String data;
    private Type type;

    public String getData() {
        return data;
    }

    public Type getType() {
        return type;
    }

    /**
     * Create constructor with generic which extends AbstractData.
     *
     * @param id
     * @param type
     * @param data
     * @param <T>
     */
    <T extends AbstractData> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();
    }

    /**
     * Override convertToString.
     *
     * @return
     */
    @Override
    String convertToString() {
        return null;
    }

    /**
     * Override method toString.
     * @return
     */
    @Override
    public String toString() {
        return "StringData{" +
                "data='" + data + '\'' +
                ", type=" + type +
                '}';
    }
}
