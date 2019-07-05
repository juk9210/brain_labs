package ua.zp.brain.labs.oop.basics.streams;

import java.io.File;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File("D://Java//BrainLabs//src//main//java//ua//zp//brain//labs//oop//basics//streams");
        printNames(file);
    }
    static void printNames(File file){
        if(file == null||file.listFiles()==null||file.listFiles().length==0){
            System.out.println("Каталог не существует или пуст");
        }else{
            for(File f: file.listFiles()){
                if (f.isDirectory()){
                    printNames(f);
                }else{
                    System.out.println(file.getName()+" : "+f.getName());
                }
            }
        }
    }
}
