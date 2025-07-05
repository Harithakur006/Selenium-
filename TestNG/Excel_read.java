package com.TestNG_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excel_read {
	String fpath = "D:\\Users\\LoginData.xlsx";
 File file;
 FileInputStream filein;
 XSSFWorkbook wb;
 XSSFSheet sheet;
 XSSFRow row;
 XSSFCell cell;
 
	
@Test
  public void getdatafromFile() {
	row = sheet.getRow(0);
	cell = row.getCell(0);
	System.out.println(cell.getStringCellValue());
System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
 System.out.println(sheet.getRow(0).getCell(1).getStringCellValue()); 
      }
@Test
public void Test_2() {
	int totalRow = sheet.getPhysicalNumberOfRows();
	int totalCell = sheet.getPhysicalNumberOfRows();
for(int i =0; i<totalRow; i++) {
	row = sheet.getRow(i);
int totalCell1 = row.getPhysicalNumberOfCells(); 
	
	for(int j= 0; j<totalCell; j++) {
		cell= row.getCell(j);
		if (cell != null) {
	        System.out.print(cell.getStringCellValue() + " | ");
	    }
	}
	System.out.println();
 }
}
@BeforeTest
public void beforeclass() throws IOException {
	file = new File(fpath);
	filein = new FileInputStream(file);
	wb = new XSSFWorkbook(filein);
	sheet = wb.getSheet("LoginData");
	
	}
@AfterTest
public void after_test() throws IOException {
	wb.close();
	filein.close();
 }
}
