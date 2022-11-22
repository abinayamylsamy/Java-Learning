package com.example;

public class EncapsulationDrawSquareDemo {

    public static void main(String[] args) {
        EncapsulationDrawSquare drawSquare1 = new EncapsulationDrawSquare();
        drawSquare1.setLength(10);
        drawSquare1.draw();
        drawSquare1.drawHalf();

        EncapsulationDrawSquare drawSquare2 = new EncapsulationDrawSquare();
        drawSquare2.setLength(20);
        drawSquare2.draw();
    }
}
