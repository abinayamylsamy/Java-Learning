package com.example.encapsulation;

public class EncapsulationDrawBox {

    public EncapsulationDrawBox(int len) {
        this.length = len;
    }

    public EncapsulationDrawBox(int len, int width) {
        this.length = len;
    }

    private int length;

    private int width;

    private int height;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a box of length = "+ length + ", width = " + width + " and height = " + height);
    }

    public void setDimension(int i, int i1, int i2) {
    }
}
