package ua.zp.brain.labs.oop.basics.exceptions;

import java.io.IOException;

class StackOverFlowTest {
    static int count;
    static void test() {
        try {
            count = 54;
            System.out.println(count);
            test();
        }catch (Error c){
            System.out.println("Error");
        }finally {
            System.out.println("Very good");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
