package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Qa", "http://qa.com");
        hashMap.put("Preprod", "http://prerod.com");
        hashMap.put("Dev", "http://dev.com");
        hashMap.put("Prod", "http://prod.com");

        System.out.println(hashMap);
        System.out.println(hashMap.get("Dev"));

        hashMap.remove("prod");
        System.out.println(hashMap);

        for(String key : hashMap.keySet()) {
            System.out.println("the key is "  +  key  +  " Value is "+ hashMap.get(key));
        }

       Set s= hashMap.keySet();

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            System.out.println("the key is " + key + " Value is " + hashMap.get(key));
        }



    }
}
