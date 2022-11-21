package com.example;

public class FirstProgram {
    public static void main(String[] args) {
        // this is a single line comment
        /*
        this is a multiline comment
        comment
         */

        int a = 10;

        int c = 10;

        String s = "Abi";

        String t = "Abi";

        String n = new String("Abi");
        String x = new String("Abi");

        System.out.println(n == x);
        System.out.println(a == c);
        System.out.println(s.equals(t));
        System.out.println(t.equals(n));

        System.out.println("This is my first program");

    }
}