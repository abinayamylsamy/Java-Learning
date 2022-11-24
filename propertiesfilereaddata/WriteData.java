package com.example.propertiesfilereaddata;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteData {

    public static void main(String[] args) throws IOException {

//        step 1: create an object of FileReader Class
         FileWriter fw = new FileWriter("D:\\Projects\\JavaLearning\\src\\com\\example\\propertiesfile\\readdata.properties", true);
//         FileOutputStream fis = new FileOutputStream("D:\\Projects\\JavaLearning\\src\\com\\example\\propertiesfile\\readdata.properties, true");


//         step 2 : create an object of the Properties class
            Properties pr = new Properties();

//         step 3: use setProperty method to set the property key and value
            pr.setProperty("dob", "15- 05- 1991");

//          step 4 : load the property key and value
            pr.store(fw, "updating dob");
        }


    }






