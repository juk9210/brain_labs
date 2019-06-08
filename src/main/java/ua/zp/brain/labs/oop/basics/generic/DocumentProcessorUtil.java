package ua.zp.brain.labs.oop.basics.generic;

/**
 * Create class util DocumentProcessorUtil.
 *
 * @author Shakhov Yevhen.
 */


class DocumentProcessorUtil {
    /**
     * Create static field ID_COUNTER, to implement the id counter.And get of ID_COUNTER.
     */
    static long ID_COUNTER;

    public static long getIdCounter() {
        return ID_COUNTER;
    }

    /**
     * Create private constructor DocumentProcessorUtil.
     */
    private DocumentProcessorUtil() {
    }

    /**
     * Create method StringData convert with generic T which extends AbstractData & Storable.Inside create and return
     * an instance of the class StringData.As id, transfer incremental counter value.As a type value,
     * call the getType () method.Data value - data.
     *
     * @param data
     * @param <T>
     * @return
     */
    static <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(++ID_COUNTER, data.getType(), data);
    }

    /**
     * Create static method build with generic T.Inside "write" the incoming data in the object storeObj.
     *
     * @param storeObj
     * @param data
     * @param <T>
     */
    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
