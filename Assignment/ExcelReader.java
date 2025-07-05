package MyMavenAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelReader {
@Test
	public void dataRead() throws IOException {
		// File
		File f1=new File(System.getProperty("D.dir")+"\\hhhh\\newman\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f1);
	
	//workbook
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
	//NUMBER OF ROWS
	int rows = wb.getSheet("login").getPhysicalNumberOfRows();
	//number of cells
	int cells = wb.getSheet("login").getRow(0).getPhysicalNumberOfCells();
	
	//arrey of same size like file
	Object data[][] =new Object[rows][cells];
	
	for(int i=0; i<rows; i++)
	{
		for(int j=0; j<cells;j++)
		{
			data[i][j]= wb.getSheet("login").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data[i][j]+" ");
		}
	System.out.println();
	}
	
	
	
	
	
	
	
	}
}
