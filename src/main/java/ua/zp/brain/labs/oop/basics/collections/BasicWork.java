package ua.zp.brain.labs.oop.basics.collections;

import java.util.*;


/**
 * Create class BasicWork from basic work of Collections Framework.
 * @author Shakhov Yevhen.
 */

class BasicWork {
    /**
     * Create method main.
     * @param args
     */
    public static void main(String[] args) {
        /*
        PART1
        Basic work with List.
         */
        ArrayList<String> list1 = new ArrayList<>(); //Create  ArrayList<String> - list1.
        String [] arr = {"Dog","Cat","Parrot","Fish"}; //Create array of strings.
        Collections.addAll(list1,arr); //Add to the list all elements of the array.
        System.out.println("List1: "+list1); //Derive in console list1.
        /*
        Create list2 initializing it previous list.And derive in console list2.
         */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dog");
        list2.add("Cat");
        list2.add("Parrot");
        list2.add("Fish");
        System.out.println("List2: "+list2.toString());
        /*
        Create list3 using Arrays.asList.And derive in console list3.
         */
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Leopard","Lion","Tiger"));
        System.out.println("List 3: "+list3);
        /*
        Insert the list3 in the middle of the list2.And derive in console list2.
         */
        list2.addAll(2,list3);
        System.out.println("List3 inserted in the middle of List2: "+list2);
        /*
        Sort the list descending and derive in console.
         */
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("Sorted list descending: "+list2);
        /*
        Using the listiterator delete every second list item.And derive in console.
         */
        ListIterator<String> it = list2.listIterator();
        ArrayList<String> list4 = new ArrayList<>(list2);
        for (int i = it.nextIndex()+1; i <list4.size() ; i++) {
            list4.remove(i);
        }
        System.out.println("List without every second item: "+list4);
        /*
          PART 2
          Basic work with Set.
         */
        HashSet<String> set1 = new HashSet<>(); //Create HashSet<String> - set1.
        set1.add("Fox"); //Insert two lines into the set1.
        set1.add("Wolf");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("In set1 insert all items of list1 and list2: "+set1);
        /*

         */
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("In set2 insert all items of list2 and list3: "+set2);
        /*
        PART 3
         */
        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(1,"January");
        map1.put(2,"February");
        map1.put(3,"March");
        map1.put(4,"April");
        map1.put(5,"May");
        map1.put(6,"June");
        map1.put(7,"July");
        map1.put(8,"August");
        map1.put(9,"September");
        map1.put(10,"October");
        map1.put(11,"November");
        map1.put(12,"December");
        System.out.println("First and last month of the year: "+map1.get(1)+", "+map1.get(12));
        map1.replace(6,"Vacation");
        System.out.println("Display the sixth month: "+map1.get(6));
        /*

         */
        Map<Integer,String> map2 = new HashMap<>();
        map2.putAll(map1);
        for (Map.Entry<Integer,String> month: map1.entrySet()){
            System.out.printf("Key : %d Value : %s \n",month.getKey(),month.getValue());
        }
        System.out.println();
        for (Map.Entry<Integer,String> month1: map2.entrySet()){
            System.out.printf("Key : %d Value : %s \n",month1.getKey(),month1.getValue());
        }
        HashMap<String,Set<String>> map3 = new HashMap<>();
        /*

         */
        map3.put("Shakhov", Collections.singleton("06471568,Sad@mail.ru,SAD"));
        System.out.println("Shakhov");
    }
}
