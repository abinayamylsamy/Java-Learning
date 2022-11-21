package com.example;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        SingleDimensionalArray value = new SingleDimensionalArray();
        value.mDAExample();
    }
    public void mDAExample() {
        int myInt = 10;
        int[] myIntArray = new int[10];
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray.length);


        int[] myIntArray1 = {10, 20, 30, 40, 50};
        System.out.println(myIntArray1[2]);

        for (int i = 0; i < myIntArray1.length; i++)
        System.out.println(myIntArray1[i]);


    }
}






//
//        System.out.println(myIntArray1[i]);// -> myIntArray1[0] -> 10
//        i++;
//        System.out.println(myIntArray1[i]);// -> myIntArray1[1] -> 20
//        i++;
//        System.out.println(myIntArray1[i]);// -> myIntArray1[2] -> 30
//        i++;
//        System.out.println(myIntArray1[i]);// -> myIntArray1[3] -> 40
//        i++;
//        System.out.println(myIntArray1[i]);// -> myIntArray1[4] -> 50


