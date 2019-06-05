package ua.zp.brain.labs.oop.basics.generic;

interface Storable<S> {
    S read();
    void write(S data);
    Type getType();
}
