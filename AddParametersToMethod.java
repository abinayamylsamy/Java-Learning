package com.example;

public class AddParametersToMethod {
    public static void main(String[] args) {
        AddParametersToMethod example = new AddParametersToMethod();
        example.doLogin(5,10);
        example.diffParameters("Abinaya",1991, 2);

    }
    public int doLogin(int x, int y){

       int z = x+y;
        System.out.println(z);
        return z;
    }
    public void diffParameters(String A, float C, int B) {

        System.out.println (A +C + B);
    }

}
