package com.example;

public class VariableExercise {


    public static void main(String[] args) {


        //Here exersiceNo1 is class level function so we are accessing that method by creating instance variable
        VariableExercise exercise = new VariableExercise();
        exercise.exersiceNo1();

        //Here exersiceNo2 is static function so we are accessing directly by calling with Classname
        VariableExercise.exersiceNo2();

    }

    public void exersiceNo1() {

        int a = 10;
        int b = 20;
        System.out.println(a + b);

    }

    public static void exersiceNo2() {

        int c = 10;
        int d = 20;
        System.out.println(c + d);

    }
}
