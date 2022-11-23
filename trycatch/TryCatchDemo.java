package com.example.trycatch;

public class TryCatchDemo {

    public static void main(String[] args) {
        TryCatchDemo tcd = new TryCatchDemo();
        tcd.example();
    }

    public void example() {
    try {
        int i = 10;
        System.out.println("before division");
        System.out.println(10 / 0);
    }
     catch (Throwable t) {
         System.out.println(t.getMessage());
         System.out.println(t.getCause());
         System.out.println(t.getStackTrace());
     }
    finally {
        System.out.println("this is after division");
    }

        System.out.println("this is final");


    }


        }
