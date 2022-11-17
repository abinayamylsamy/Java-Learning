package com.example;

public class VariableExercise5 {

     static int global = 50;

    public void exersiceNo1() {
        int a = 10;
        int b = 20;
        System.out.println(a + b + global);
    }

    public static void main(String[] args) {
        //Here exersiceNo1 is class level function so we are accessing that method by creating instance variable
        VariableExercise5 name = new VariableExercise5();
        name.exersiceNo1();
    }

}
