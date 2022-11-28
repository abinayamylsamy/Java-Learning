package com.example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

//       HashSet - will not repeat the duplicate values
//        HashSet - will not the store the values by starting from 0th index, it uses hash algorithms

        HashSet hs = new HashSet();
//        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(150);
        hs.add("nila");
        hs.add("nila");
        hs.add("mohan");
        hs.add(150);
        hs.add(250);
        hs.add(350);

        System.out.println(hs);
//
            hs.remove(150);


//          Defining for each loop
//            for(Object ob : hs)
//            {
//                System.out.println(ob);
//            }

//            Defining Iterator
        Iterator itr = hs.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }

        }

                }

