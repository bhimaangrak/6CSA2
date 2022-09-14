package generic;

import org.testng.Reporter;

public class WebGeneric extends BaseTest{
	
  public static void verifyTitle(String expectedTitle) {
	  String actualTitle = driver.getTitle();
	  if(expectedTitle.equals(actualTitle))
		  Reporter.log("homepage Displayed", true);
	  else 
		  Reporter.log("homepage not Displayes", true);
		  
	  }
  public static void verifyurl(String expectedurl) {
	  String actualUrl = driver.getCurrentUrl();
	  if (expectedurl.equals(actualUrl)) 
		  Reporter.log("homepage Displayed",true);
		  else
			  Reporter.log("homepage not Displayed",true);
			  		
	}
  }

