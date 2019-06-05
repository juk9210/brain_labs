package ua.zp.brain.labs.oop.basics.generic;

class StringData extends AbstractData {
    private String data;
    private Type type;

    public String getData() {
        return data;
    }

    public Type getType() {
        return type;
    }

    <T extends AbstractData&Storable> StringData(long id, Type type, T data){
        super(id);
        this.type=type;
        this.data =data.toString();
    }
}
