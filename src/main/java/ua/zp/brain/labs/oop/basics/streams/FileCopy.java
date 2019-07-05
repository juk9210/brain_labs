package ua.zp.brain.labs.oop.basics.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("D://Java//BrainLabs//fun.txt");
            FileOutputStream file2 = new FileOutputStream("D://Java//BrainLabs//fun2.txt")) {
            byte[] buff = new byte[file.available()];
            file.read(buff,0,buff.length);
            file2.write(buff,0,buff.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
