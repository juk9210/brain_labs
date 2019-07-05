package ua.zp.brain.labs.oop.basics.streams;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D://Java//BrainLabs//src//main//java//ua//zp//brain//labs//oop//basics//" +
                "multithreading//RaceCarRunnable.java");
        try(BufferedReader br = new BufferedReader(new FileReader(file.getPath()))){
            int s;
            while((s=br.read())!=-1){
                System.out.print((char)s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
