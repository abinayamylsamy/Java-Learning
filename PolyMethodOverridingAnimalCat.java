package com.example;

public class PolyMethodOverridingAnimalCat extends PolyMethodOverridingAnimal {

    public static void main(String[] args) {
        PolyMethodOverridingAnimalCat pmor = new PolyMethodOverridingAnimalCat();
        pmor.animalnoise();
        pmor.animalnoise("dog");

    }
    public void animalnoise(){
        System.out.println("Cat Meows");

    }
    public void animalnoise(String S){
        System.out.println("dog");

    }
}
