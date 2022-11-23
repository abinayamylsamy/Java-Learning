package com.example.finalkeyword;

public class Child extends Parent  {

    final int i = 10;

    public static void main(String[] args) {
        Child c= new Child();
        c.getdata();
//        c.i = 20;
        c.getdata();
        c.getdata();

    }
     public void getdata() {
     System.out.println(i);


 }

}
