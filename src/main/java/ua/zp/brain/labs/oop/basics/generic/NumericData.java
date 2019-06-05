package ua.zp.brain.labs.oop.basics.generic;

class NumericData extends AbstractData implements Storable<Number> {
    final Type type = Type.NUM;
    private Number data;

    public NumericData(long id, Number data) {
        super(id);
        this.data = data;
    }

    @Override
    public Number read() {
        return null;
    }

    @Override
    public void write(Number data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
