package ua.zp.brain.labs.oop.basics.generic;

//import java.io.*;

class DocumentProcessorUtil {
    static long ID_COUNTER;

    public static long getIdCounter() {
        return ID_COUNTER;
    }

    private DocumentProcessorUtil() {
    }

    <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(++ID_COUNTER, data.getType(), data);
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
