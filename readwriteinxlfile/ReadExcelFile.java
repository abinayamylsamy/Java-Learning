package com.example.readwriteinxlfile;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {

        File f= new File("D:\\Projects\\JavaLearning\\src\\com\\example\\readwritedata\\file.xlsx");
        FileInputStream fis = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet0 = workbook.getSheetAt(0);
//        Row r0= sheet0.getRow(0);
//        Cell c0= r0.getCell(0);
//        Row r1= sheet0.getRow(1);
//        Cell c1= r1.getCell(1);
//        Row r2= sheet0.getRow(2);
//        Cell c2= r2.getCell(2);
//
//        System.out.println(c0);
//        System.out.println(c1);
//        System.out.println(c2);



        for(Row row : sheet0){
            for(Cell cell : row) {
                switch(cell.getCellType())
                {
                    case STRING:
                    System.out.println(cell.getStringCellValue());
                    break;

                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;

                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;




                }
            }
        }



        fis.close();
    }
}
