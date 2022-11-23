package com.example.polymorphism;

public class PolyMethodOverridingAnimal{
    public static void main(String[] args) {
        PolyMethodOverridingAnimal pmor = new  PolyMethodOverridingAnimal();
        pmor.animalnoise();
    }
    public void animalnoise(){
        System.out.println("Animal makes noise");

    }
}
