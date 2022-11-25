package com.example.txtandcsvfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTxtFile {
    public static void main(String[] args) throws IOException {

//        step1: create an object of the FileWriter Class
        FileWriter fw = new FileWriter("D:\\Projects\\JavaLearning\\src\\com\\example\\txtandcsvfile\\write.txt", true);

//        step2: create an object of the BufferedWriter Class
        BufferedWriter bw = new BufferedWriter(fw);

//        step3 : write the data
        bw.write("name = abinaya");

        bw.close();


    }
}
