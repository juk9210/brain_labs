package ua.zp.brain.labs.oop.basics.serialization;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(CardType.VIZA,"PrivatBank","4534 3543 4532",
                "12-01-20",154757);
        File file  = new File("D://Java//BrainLabs//fun.txt");
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {
            os.writeObject(cc);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
