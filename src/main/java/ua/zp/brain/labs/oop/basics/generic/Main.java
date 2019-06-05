package ua.zp.brain.labs.oop.basics.generic;

import static ua.zp.brain.labs.oop.basics.generic.DocumentProcessorUtil.ID_COUNTER;

class Main {
    public static void main(String[] args) {
        String text = "Данные в байтах";
        XmlData xml = new XmlData(++ID_COUNTER,"<?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        BinaryData bin = new BinaryData(++ID_COUNTER,text.getBytes());
        NumericData num = new NumericData(++ID_COUNTER,1500000L);
        DocumentProcessorUtil.build(xml,);
        DocumentProcessorUtil.build(bin,);
        DocumentProcessorUtil.build(num,);
    }
}
