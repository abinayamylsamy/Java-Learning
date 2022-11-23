package com.example.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        MultiDimensionalArray value = new MultiDimensionalArray();
        value.arrayExample();

    }
    public void arrayExample() {

        int myInt = 10;
        int[][] myIntArray = new int[2][3];
        myIntArray[0][0] = 10;
        myIntArray[0][1] = 20;
        myIntArray[0][2] = 30;
        myIntArray[1][0] = 40;
        myIntArray[1][1] = 50;
        myIntArray[1][2] = 60;
        System.out.println(myIntArray[1][2]);



        int[][] myIntArray1 = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(myIntArray1[1][2]);




    }


}

