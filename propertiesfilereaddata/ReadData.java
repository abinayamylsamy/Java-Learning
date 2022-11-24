package com.example.propertiesfilereaddata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

    public static void main(String[] args) throws IOException {

//        step 1: create an object of FileReader Class
        FileReader fr = new FileReader("D:\\Projects\\JavaLearning\\src\\com\\example\\propertiesfile\\readdata.properties");
//        FileInputStream fis = new FileInputStream("D:\\Projects\\JavaLearning\\src\\com\\example\\propertiesfile\\readdata.properties");
//        FileReader fr = new FileReader(System.getProperty("user.dir") + " \\src\\com\\example\\propertiesfile\\readdata.properties");


//         step 2 : create an object of the Properties class
        Properties pr = new Properties();

//         step 3: load the Filereader in properties variable
        pr.load(fr);

//            step 4 : use getProperty method to gaet the property value
        System.out.println(pr.getProperty("name"));
        System.out.println(System.getProperty("user.dir"));

    }




}

