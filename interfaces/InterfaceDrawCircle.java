package com.example.interfaces;

public class InterfaceDrawCircle implements InterfaceDrawShape {
    public static void main(String[] args) {
        InterfaceDrawCircle ifdcircle = new InterfaceDrawCircle();
        ifdcircle.colorShape();
        ifdcircle.moveshape();
        ifdcircle.drawShape();

        }




    @Override
    public void drawShape() {
        System.out.println( " drawing circle");

    }

    @Override
    public void colorShape() {
        System.out.println( " coloring circle");

    }

    @Override
    public void moveshape() {
        System.out.println( " moving circle");

    }

}