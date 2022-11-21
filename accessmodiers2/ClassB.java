package com.example.accessmodiers2;

import com.example.accessmodifiers1.ClassA;
import com.example.accessmodifiers1.ClassAA;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassA some = new ClassA();
        some.publicMethod();
        ClassB method = new ClassB();
        method.protectedMethod();



        ClassAA somme = new ClassAA();
        somme.methodAA();
    }
}
