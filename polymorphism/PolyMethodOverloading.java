package com.example.polymorphism;

public class PolyMethodOverloading {
    public static void main(String[] args) {
        PolyMethodOverloading pmo = new PolyMethodOverloading();
        pmo.loginFunctionality("Abinaya", 9952, 15);


    }

    public void loginFunctionality(String un, String Pw) {
        System.out.println("Login successfull using password");

    }

    public void loginFunctionality(String un, int Ph) {
        System.out.println("Login successfull using phone number");

    }

    public void loginFunctionality(String un, int Ph, int tk) {
        System.out.println("Login successfull using phone no and token no");
    }
}