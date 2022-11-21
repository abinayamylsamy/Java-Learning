package com.example;

public class VariableExercise3 {

     static int global = 50;

    public static void exersiceNo1() {
        int a = 10;
        int b = 20;
        System.out.println(a + b + global);
    }

    public static void main(String[] args) {
        //Here exersiceNo1 is class level function so we are accessing that method by creating instance variable
        exersiceNo1();
    }

}
