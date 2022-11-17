package com.example;

public class IfElse {
    public static void main(String[] args) {
        IfElse assign = new IfElse();
        assign.example();


    }
    public void example() {
        int no1 = 10;
        int no2 = 20;
        int no3 = 30;

        if (no1 < no2)
        {
            System.out.println("no1 is greater than no2");

            if (no1 < no3)
            {
                System.out.println("within nested if");
            }

        }
        else if (no1 == no2 )
        {
            System.out.println("no2 is equal no1");
        }
        else if (no1 > no2 )
        {
            System.out.println("no2 is grater than no1");
        }
        else
        {
            System.out.println("THIS IS FINAL BLOCK");
        }

    }
}
