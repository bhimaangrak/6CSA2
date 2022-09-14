package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Readexcel;
import generic.WebGeneric;
import pom.TimeTrackPage;
import pom.homePage;

public class Valid_Login extends BaseTest {
	@Test
	public void validLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		homePage h = new homePage(driver);
		Readexcel e = new Readexcel();
		String username = e.getDataFromExcel("Sheet1", 0, 0);
		String password =e.getDataFromExcel("Sheet1", 1, 0);
		h.getUsername().sendKeys(username);
		h.getPassword().sendKeys(password);
		h.getLoginBTN().click();
		WebGeneric wg = new WebGeneric();
		wg.verifyTitle("actiTime - Enter Time Track");
		Thread.sleep(2000);
		TimeTrackPage ttp= new TimeTrackPage(driver);
		ttp.getLogout().click();
		Thread.sleep(2000);
		
		
		
	}

}
