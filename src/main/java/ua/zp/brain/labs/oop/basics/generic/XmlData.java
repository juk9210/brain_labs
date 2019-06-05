package ua.zp.brain.labs.oop.basics.generic;

class XmlData extends AbstractData implements Storable<String> {
    final Type type = Type.XML;
    private String data;

    public XmlData(long id, String data) {
        super(id);
        this.data = data;
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
