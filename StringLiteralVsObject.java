package com.example;

public class StringLiteralVsObject {
    public static void main(String[] args) {

        int a = 10;

        int c = 10;

        String s = "Abi";

        //here t and s will be pointing to the same memory location
        String t = "Abi";

        //new String will create this value in new memory location
        String n = new String("Abi");
        String x = new String("Abi");

        // == will compare the memory always so here s and t are pointing to same memory so it's true
        System.out.println(s == t); //true both s and t are pointing to same memory location
        System.out.println(a == c); //true
        System.out.println(n == x); //false even though n and x values are same result is false because both n and x are pointing to diff memory location

        // .equals method will always compare the value of the string
        System.out.println(s.equals(t)); //true
        System.out.println(n.equals(x)); //true


    }
}