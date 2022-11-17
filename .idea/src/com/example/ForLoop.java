package com.example;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop value = new ForLoop();
        value.forLoopExample();
    }

    public void forLoopExample() {


//     for(initialization;condition;increment or decrement)

        for (int j = 1; j <= 10; j++)
        {
            System.out.println(j);
        }
//        this is also possible
        int j = 5;
        for (; j <= 10; )
        {
            System.out.println(j);
            j++;
        }


    }



}

//          While Loop - Used when you don't know the number of iterations
//          DoWhile Loop - Used when you don't know the number of iterations but still you want to print at least once irrespective of the condition
//          For Loop - You know the number of Iteration