package testngp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		FileInputStream xlfile=new FileInputStream(".\\excelsheets\\Test case.xlsx");
	    XSSFWorkbook workbook =new XSSFWorkbook(xlfile);
	   XSSFSheet sheet= workbook.getSheet("gurusheet");
	   sheet.getRow(1);
	  int rows= sheet.getLastRowNum();
	  int cols= sheet.getRow(1).getLastCellNum();
	  System.out.println("no of rows "+rows);
	  System.out.println("no of cols "+cols);
	  for (int i = 0; i < rows; i++) {
		  XSSFRow	rowData=sheet.getRow(i);
		for (int j = 0; j < cols; j++) {
			XSSFCell cell=rowData.getCell(j);
			System.out.print(cell+"   ");
		}
		System.out.println();
	}
	    
	}

}
