package ua.zp.brain.labs.oop.basics.generic;

import java.util.Arrays;


import static ua.zp.brain.labs.oop.basics.generic.DocumentProcessorUtil.ID_COUNTER;

/**
 * Craete class Main.
 *
 * @author Shakhov Yevhen.
 */
class Main {
    /**
     * Create ctatic method main.
     *
     * @param args
     */
    public static void main(String[] args) {

        String text = "Данные в байтах";
        XmlData xml = new XmlData(++ID_COUNTER);
        BinaryData bin = new BinaryData(++ID_COUNTER);
        NumericData num = new NumericData(++ID_COUNTER);
        DocumentProcessorUtil.build(xml, "<?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        DocumentProcessorUtil.build(bin, text.getBytes());
        DocumentProcessorUtil.build(num, 1500000L);
        System.out.println(DocumentProcessorUtil.convert(xml));
        System.out.println(DocumentProcessorUtil.convert(bin));
        System.out.println(DocumentProcessorUtil.convert(num));
    }
}
