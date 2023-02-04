package aPages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import aObject.AaHomeObj;
import aResouc.ABase;

public class AHome extends ABase{
	
	 public WebDriver driver;
	 
	 public static Logger log=LogManager.getLogger(AHome.class.getName());
	@Test
	public void aNavigate() throws IOException {	
	driver=aDriveIntil();
	
 log.info("navigate page");
	
	AaHomeObj Ah=new AaHomeObj(driver);
	
	Ah.aClick().click();
	
	

}
}
