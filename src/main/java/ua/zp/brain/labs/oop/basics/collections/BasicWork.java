package ua.zp.brain.labs.oop.basics.collections;

import java.util.*;


/**
 * @author Shakhov Yevhen.
 */

public class BasicWork {
    public static void main(String[] args) {
        /*
        PART1
         */
        ArrayList<String> list1 = new ArrayList<>();
        String [] arr = {"Dog","Cat","Parrot","Fish"};
        Collections.addAll(list1,arr);
        System.out.println("List1: "+list1);
        /*

         */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dog");
        list2.add("Cat");
        list2.add("Parrot");
        list2.add("Fish");
        System.out.println("List2: "+list2.toString());
        /*

         */
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Leopard","Lion","Tiger"));
        System.out.println("List 3: "+list3);
        /*

         */
//        System.out.println(list2.size());
//        for (int i = 1; i <list2.size() ; i++) {
//            if(i == (list2.size() / 2)){
//
//            }
//        }
        list2.addAll(2,list3);
        System.out.println("List3 inserted in the middle of List2: "+list2);
        /*

         */
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("Sorted list descending: "+list2);
        /*

         */
        ListIterator<String> it = list2.listIterator();
        ArrayList<String> list4 = new ArrayList<>(list2);
        for (int i = it.nextIndex()+1; i <list4.size() ; i++) {
            list4.remove(i);
        }
        System.out.println("List without every second item: "+list4);
        /*
          PART 2
         */

    }
}
