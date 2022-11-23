package com.example.encapsulation;

public class EncapsulationDrawSquare {

    private int length;

    private int width;

    public void draw() {
        System.out.println("Drawing a square of length = "+ length + " and width = " + width);
    }

    public void drawHalf() {
        System.out.println("Drawing a half square of length = "+ length/2 + " and width = " + width/2);
    }

    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }
}
