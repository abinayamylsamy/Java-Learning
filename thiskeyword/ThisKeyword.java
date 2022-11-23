package com.example.thiskeyword;

public class ThisKeyword {
    public static void main(String[] args) {
        ThisKeyword tkw = new ThisKeyword(200, 300);
        tkw.getdata();


    }
    int a ;
    int b ;
    public ThisKeyword() {
        System.out.println("this is default constructor");
    }

    public ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
        System.out.println("this is parameterized constructor ");
    }
    int x = 10;
    int y = 20;

    public  void getdata() {
        int x= 30;
        int y = 50;
        System.out.println(this.x + this.y);
        System.out.println(x + y);
        this.getdata1();

    }
    public  void getdata1() {
        int x = 50;
        int y = 50;
        System.out.println(x + y);

    }





}


