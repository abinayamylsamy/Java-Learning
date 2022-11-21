package com.example.accessmodifiers1;

public class ClassAA {

    public static void main(String[] args) {
        ClassA object = new ClassA();
        object.protectedMethod();
        object.defaultMethod();
        object.publicMethod();

    }

    public void methodAA() {

        System.out.println(" This is MethodAA");

    }
}
