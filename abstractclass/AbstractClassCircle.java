package com.example.abstractclass;

public class AbstractClassCircle extends AbstractClass {
    public static void main(String[] args) {
        AbstractClassCircle abccircle = new AbstractClassCircle();
        abccircle.colorShape();
        abccircle.drawShape();
        abccircle.moveShape();
        abccircle.commonfunction();
    }



    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");

    }

    @Override
    public void colorShape() {
        System.out.println("Coloring Circle");

    }

    @Override
    public void moveShape() {
        System.out.println("moving Circle");

    }
}
