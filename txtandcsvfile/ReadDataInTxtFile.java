package com.example.txtandcsvfile;

import java.io.*;

public class ReadDataInTxtFile {

    public static void main(String[] args) throws IOException {

        File f = new File("D:\\Projects\\JavaLearning\\src\\com\\example\\txtandcsvfile\\write.txt");

//        step1: create an object of the FileWriter Class
        FileReader fr = new FileReader(f);

//        step2: create an object of the BufferedWriter Class
        BufferedReader br = new BufferedReader(fr);

//        step3 : read the data
        System.out.println(br.readLine());
        System.out.println(br.readLine());

        br.close();

    }
}
