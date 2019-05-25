package ua.zp.brain.labs.oop.basics.string;

import java.util.Scanner;

/**
 * @author
 */

public class StringTest {
    public static void main(String[] args) {
//        PART1
        String str = "Hello";

        String str1 = new String("Alex");

        char arr[] = {'s', 'a', 'd'};
        String str2 = new String(arr);

        String s = "boy";
        String str3 = new String(s.getBytes());

        StringBuilder builder = new StringBuilder("a");
        String str4 = new String(builder);

//        PART2
        String fruit = "Апельсин,Яблоко,Гранат,Груша";
        String[] arr1;
        arr1 = fruit.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int max = 0;
        int maxi = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length() > max) {
                max = arr1[i].length();
                maxi = i;
            }
        }
        System.out.println(arr1[maxi].toLowerCase());

        System.out.println(arr1[maxi].toLowerCase().substring(0, 3));

//        PART3
        String str5 = " Я_новая_строка   ";
        System.out.println(str5.trim().replace('_', ' '));

//        PART4
        Scanner a = new Scanner(System.in);
        System.out.println("Вы ввели: ");
        String str6 = a.nextLine();
        if (str6.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (str6.toLowerCase().endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (str6.equalsIgnoreCase("ошибка")) {
            System.out.println("Произошла ошибка");
        }
//    PART5
        String str7 = "\n";
        StringBuilder sb = new StringBuilder(100);
        sb.append(str)
                .append(str1)
                .append(str2)
                .append(str7)
                .append(str3)
                .append(str4)
                .append(str5)
                .append(str7)
                .append(str6)
                .reverse();
        System.out.println(sb);
    }
}