package ua.zp.brain.labs.oop.basics.generic;

class BinaryData extends AbstractData implements Storable<byte []> {
    final Type type = Type.BIN;
    private byte [] data;

    public BinaryData(long id, byte[] data) {
        super(id);
        this.data = data;
    }

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
