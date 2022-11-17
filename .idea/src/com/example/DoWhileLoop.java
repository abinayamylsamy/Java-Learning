package com.example;

public class DoWhileLoop {
    public static void main(String[] args) {
        DoWhileLoop assign = new DoWhileLoop();
        assign.doWhileExample();

    }

    public void doWhileExample() {

        // 1. Do While LooP
        int X = 1;
        do {
            System.out.println(X);
            X++;

        } while (X <= 10);

      //  2. while Loop
        while (X <= 10) {
            System.out.println(X);
        }



    }
}