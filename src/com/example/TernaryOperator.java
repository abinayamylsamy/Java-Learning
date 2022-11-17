package com.example;

public class TernaryOperator {

    public static void main(String[] args) {
        TernaryOperator welcome = new TernaryOperator();
        welcome.example();

    }
    public void example() {

        int x = 20;
        int y = 40;

        String value = (x == y) ? "true" : "false";
        System.out.println(value);

        int amount = (x == y) ? 1 : 2;
        System.out.println(amount);

        boolean z = (x == y) ? true : false;
        System.out.println(z);

    }
}
