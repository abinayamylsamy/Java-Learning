package com.example;

public class BreakAndContinue {
    public static void main(String[] args) {
        BreakAndContinue value = new BreakAndContinue();
        value.bcExample();

    }
    public void bcExample() {

        for (int i = 1; i <= 10; i++)
        {
            if (i == 8)
        continue;
       System.out.println(i);
        }

        for (int i = 1; i <= 10; i++)
        {
            if (i == 8)
          break;System.out.println(i);
        }

    }
}
