package Abcd;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Hello {



	public  String readDataFromExcel(String sheet , int rowNum , int colNum ) throws EncryptedDocumentException, IOException  {
		FileInputStream fis= new FileInputStream("./src/test/resources/Data1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	String string = wb.getSheet(sheet).getRow(rowNum).getCell(colNum).toString();
	return string;
	
	
	
	
	}
	{
	}
	}
	

