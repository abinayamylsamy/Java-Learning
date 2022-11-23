package com.example.encapsulation;

public class EncapsulationDrawBoxDemo {

    public static void main(String[] args) {
        EncapsulationDrawBox drawBox = new EncapsulationDrawBox(50);
        drawBox.setDimension(10, 5, 20);
        drawBox.draw();
    }
}
