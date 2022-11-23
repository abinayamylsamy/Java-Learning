package com.example;

public class ConstructorExample {

    public ConstructorExample() {

        System.out.println("no arguemnents constructor");
    }

    public ConstructorExample(int i) {

        System.out.println("Integer arguemnents constructor");

    }
    public ConstructorExample(int i, int e) {

        System.out.println("double integer constructor");

    }
    public ConstructorExample(String a) {

        System.out.println("String constructor");

    }
    public static void main(String[] args) {

        ConstructorExample ce = new ConstructorExample("abinaya");


    }



}
