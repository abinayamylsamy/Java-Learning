package com.example;

public class HelloWorld {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int number1 = 100;
        int number2 = 500;
        int result = number1+ number2;
        System.out.println("Result of adding number1 " + number1 + "and number2 " + number2 +" is " + result);

        int result2 = cal.subTwoNumber(100, 500);
        System.out.println("Result of adding two numbers is " + result2);
    }

}
