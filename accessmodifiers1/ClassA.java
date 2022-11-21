package com.example.accessmodifiers1;

public class ClassA {

    public int publicVariable = 1;
    int defaultVariable = 2;
    protected int protectedVariable = 3;
    private int privateVariable = 4;


    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.publicMethod();
        ca.defaultMethod();
        ca.privateMethod();
        ca.protectedMethod();
    }

    public void publicMethod() {
        System.out.println("This is PublicMethod");
//        privateMethod();
//        defaultMethod();
//        protectedMethod();

    }

    void defaultMethod() {
        System.out.println("This is DefaultMethod");
    }
    private void privateMethod() {
        System.out.println("This is PrivateMethod");

    }
    protected void protectedMethod() {
        System.out.println("This is ProtectedMethod");
    }

}
