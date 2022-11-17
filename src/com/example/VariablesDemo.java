package com.example;

public class VariablesDemo {

    static int myThirdNumber = 30; // instance variable

    public static void main(String[] args) {
        VariablesDemo variablesDemo = new VariablesDemo();
        //variablesDemo.myMethod();
        VariablesDemo.noMethod();
        //myMethod();

        VariablesDemo variablesDemo1 = new VariablesDemo();
        variablesDemo1.noMethod();
    }

    public static void noMethod() {
        System.out.println("noMethod");
        int myForthNumber = 20;     // local variable
        char ch = 'B';
        System.out.println(myThirdNumber);
        myThirdNumber = myForthNumber + myThirdNumber;
        System.out.println(myThirdNumber);
    }

    public void myMethod() {
        System.out.println("myMethod");
        int myFirstNumber = 10;    // local variable
        int mySecondNumber = 10;
        char ch = 'B';
        String str = "Abinaya";

        //System.out.println(str + myFirstNumber );

        System.out.println(mySecondNumber + myThirdNumber );
    }

}

