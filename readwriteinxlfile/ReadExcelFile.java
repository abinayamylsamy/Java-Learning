package com.example.readwriteinxlfile;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {

        ReadExcelFile readExcelFile = new ReadExcelFile();

        File f= new File("D:\\Projects\\JavaLearning\\src\\com\\example\\readwritedata\\login-testdata.xls");
        FileInputStream fis = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fis);

        //For each loop
        for (Sheet sheet: workbook) {
            readExcelFile.readRowFromSheet(sheet);
        }

/*      Traditional for loop
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            Sheet sheet = workbook.getSheetAt(i);
        }
*/
//        Sheet sheet0 = workbook.getSheetAt(0);
//        readExcelFile.readDataFromSheet(sheet0);
//
//        System.out.println("Printing second sheet");
//
//        Sheet sheet1 = workbook.getSheetAt(1);
//        readExcelFile.readDataFromSheet(sheet1);

        fis.close();
    }

    private void readRowFromSheet(Sheet sheet) {
/*
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);  //Pick one Row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j); //Pick one cell
            }
        }
*/

        for(Row row : sheet){
            if (row.getRowNum() == 0) {
                //Ignoring excel headers
                continue;
            }
            String email = null;
            String password = null;
            for(Cell cell : row) {

                if (cell.getColumnIndex() == 0) {
                    //Ignoring column S.No values
                    continue;
                }

                if (cell.getColumnIndex() == 1) {
                   email = cell.getStringCellValue();
                }

                if (cell.getColumnIndex() == 2) {
                    password = cell.getStringCellValue();
                }

                /*switch(cell.getCellType()) {
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;

                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;

                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                }*/
            }
            System.out.println("Email is "+email + " Password is "+ password);
            //SeleniumLoginWebdriver.login(email, password)
        }
    }
}
