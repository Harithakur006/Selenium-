package MyMavenAssignment;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Project.AfterTest;

public class CreateLoginFile {
	String fPath = "D:\\hhhh\\newman\\Book1.xslx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	int i=0;
	
	@Test(dataProvider = "loginData")
	
	public void createLoginData(String un, String ps) {
		row = sheet.createRow(i);
		cell = row.createCell(0);
		cell.setCellValue(un);
		cell = row.createCell(1);
		cell.setCellValue(ps); i++;
	}	
	@DataProvider
	public Object [][] loginData(){
		return new Object [][] {
			new Object[] {"Admin" , "admin123"},
			new Object[] {"Rohan" , "rohan123"},
			new Object[] {"Anand" , "anand123"},
			new Object[] {"Ravi" , "ravi123"},
			new Object[] {"Rachin" , "Rachin123"},
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException  {
	file = new File(fPath);
	fos = new FileOutputStream(file);
	wb= new XSSFWorkbook();
	sheet = wb.createSheet("login");
	
	}
	
	@AfterTest
	public void AfterTest() throws IOException  {
		wb.write(fos);
		wb.close();
		fos.close();
		
		
	 }
	}
 
