package com.example;

public class AbstractClassSquare extends AbstractClass {
    public static void main(String[] args) {
        AbstractClassSquare abcsquare = new AbstractClassSquare();
        abcsquare.colorShape();
        abcsquare.drawShape();
        abcsquare.moveShape();
        abcsquare.commonfunction();
    }



    @Override
    public void drawShape() {
        System.out.println("Drawing Square");

    }

    @Override
    public void colorShape() {
        System.out.println("Coloring Square");

    }

    @Override
    public void moveShape() {
        System.out.println("moving Square");

    }
}
