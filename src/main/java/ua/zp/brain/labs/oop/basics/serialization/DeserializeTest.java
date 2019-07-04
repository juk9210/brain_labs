package ua.zp.brain.labs.oop.basics.serialization;

import java.io.*;

public class DeserializeTest {
    public static void main(String[] args) {
        File file1 = new File("D://Java//BrainLabs//fun.txt");
        try (ObjectInputStream os1 = new ObjectInputStream(new FileInputStream(file1))) {
            CreditCard cc = (CreditCard) os1.readObject();
            System.out.printf(cc.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
