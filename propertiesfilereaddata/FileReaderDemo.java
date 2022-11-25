package com.example.propertiesfilereaddata;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileReaderDemo {

    public static void main(String[] args) {
       FileReaderDemo demo = new FileReaderDemo();
        try {
            demo.readFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found exception occurred. please contact admin");
        }

    }

    public void readFile() throws IOException {
        FileReader fr = new FileReader(System.getProperty("user.dir") + "\\src\\com\\example\\TestData.properties");

        Properties pr = new Properties();

        pr.load(fr);

        String name = pr.getProperty("application.name");
        String age = pr.getProperty("application.age");

        System.out.println("Name of the user is "+name);
        System.out.println("Age of the user is "+age);

        System.out.println("User directory "+System.getProperty("user.dir"));
        fr.close();
    }
}
