package com.example;

public class Person {

    int age;

    String name;

    String address;

    public void setAge(int age) {
        if (age > 18 && age < 60) {
            this.age = age;
        } else {
            System.out.println("Person is minor");
        }
    }
}
