package com.example.readwriteinxlfile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("Sheet1 ");

        Row r0 = sheet1.createRow(0);
        Cell c0 = r0.createCell(0);
        c0.setCellValue("Abinaya");

        Row r1 = sheet1.createRow(1);
        Cell c1 = r1.createCell(1);
        c1.setCellValue("Mohan");

        Row r2 = sheet1.createRow(2);
        Cell c2 = r2.createCell(2);
        c2.setCellValue("Nittu");


        File f= new File("D:\\Projects\\JavaLearning\\src\\com\\example\\readwritedata\\file.xlsx");

        FileOutputStream fos = new FileOutputStream(f);
        workbook.write(fos);

        fos.close();
        workbook.close();



    }

}
