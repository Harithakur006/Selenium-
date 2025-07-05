package MyMavenAssignment;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class excelReading {
	String fPath = "D:\\hhhh\\newman\\Book1.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
 public void getData() { 
	row = sheet.getRow(0);
	cell = row.getCell(0);
	
	System.out.println(cell.getStringCellValue());
 System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
  }
  @Test
  public void getAllData() {
	  int totalRows = sheet.getPhysicalNumberOfRows();
	  int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
	  for(int i=0; i<totalRows; i++)
	  {
		row=sheet.getRow(i);
		for(int j=0; j<totalCells; j++)
		{
		cell=row.getCell(j);
		System.out.println(cell.getStringCellValue());
		}
	
	  }
  }	  
 

  @BeforeTest
  public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//while rading the data from workbook pass the fileInputStream object
	  sheet = wb.getSheet("Login");
  }
	  

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
  }

}
