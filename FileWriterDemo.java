package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWriterDemo {

    public static void main(String[] args) {
       FileWriterDemo demo = new FileWriterDemo();
        try {
            demo.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found exception occurred. please contact admin");
        }

    }

    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter(System.getProperty("user.dir") + "\\src\\com\\example\\TestData.properties", true);

        Properties pr = new Properties();

        pr.setProperty("dob", "12-02-2012");
        pr.store(writer, "Sample comment");
    }
}
