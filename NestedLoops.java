package com.example;

public class NestedLoops {
    public static void main(String[] args) {
        NestedLoops value = new NestedLoops();
        value.example();

    }
    public void example() {
        int count = 0;
        for (int i= 1; i<=4; i++)
        {
            int j = 1;
            while (j <= 3)

            {
                for (int x = 2; x <= 3; x++)
                {
                    System.out.println("value of i is "+ i + " value of j is "+ j +" value of x is "+ x);
                    count++;
                                    }
                j++;
            }
        }
        System.out.println(count);
    }

}

