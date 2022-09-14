package Abcd;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class main {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Hello h = new Hello();
	String value = h.readDataFromExcel("Sheet1", 0, 2);
		System.out.println(value);
		
	}

}