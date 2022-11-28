package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();


//        Add items to arraylist
        al.add(10);
        al.add("Abinaya");
        al.add(true);
        al.size();
//        System.out.println(al);
//        System.out.println( al.size());

//      Duplicate also can be added in Arraylist
        al.add("Abinaya");
        al.add(true);
        al.add(false);
        al.add(356);


//        System.out.println(al);

//        Removing the object from Arraylist
//        al.remove(0);
//        System.out.println(al);

//        Fetch the index value from Arraylist
        al.get(3);
//        System.out.println(al.get(3));


//       defining for loop
//        for (int i=0; i<al.size(); i++)
//        {
//            System.out.println(al.get(i));
//        }
//
//        defining for each loop
//        for (Object object :al) {
//            System.out.println(object);
//        }
//        defining Iterative class
        Iterator itr;
        itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//            defining generic angular type
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        ArrayList<String> al = new ArrayList<String>();

//          type cast
//        int i = (Integer)al.get(0);
    }
}
