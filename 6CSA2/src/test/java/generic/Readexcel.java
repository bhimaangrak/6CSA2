package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel implements Iconstant {
	public String getDataFromExcel(String sheet,int rownum,int colnum) throws EncryptedDocumentException, IOException {
	    FileInputStream fis = new FileInputStream(Excel_path);
		Workbook wrk = WorkbookFactory.create(fis);
		String value = wrk.getSheet(sheet).getRow(rownum).getCell(colnum).toString();
		return value;
	}
}