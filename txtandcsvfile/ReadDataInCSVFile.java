package com.example.txtandcsvfile;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataInCSVFile {

    public static void main(String[] args) throws IOException {

        File f = new File("D:\\Projects\\JavaLearning\\src\\com\\example\\txtandcsvfile\\write.csv");

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
