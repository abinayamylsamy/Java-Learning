package com.example;

public class Operators {

    public static void main(String[] args) {
        Operators assign = new Operators();
        assign.operatorsExample();
    }
    public void operatorsExample() {

        String name = "Abinaya";
        int no1 = 120;
        int no2 = 60;
        //no1++;
        //no2--;
        boolean type = !true;

        if (no1 <= no2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if ((no1 == 120 && no2 == 60)) {
            System.out.println("This is AND operator");
        }

        if ((no1 == 120 || no2 == 60)) {
            System.out.println("This is OR operator");
        }


        System.out.println(no1+no2);
        System.out.println(no1+name);
        System.out.println(no1/no2);
        System.out.println(type);








    }


}

