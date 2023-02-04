package aPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import aObject.AaHomeObj;
import aObject.AaLoginObject;
import aResouc.ABase;


public class Alogin extends ABase {
	
	WebDriver driver;
	 
	@DataProvider
	    public Object[][] getdata()
	    {
	    	Object[][] data= new Object[2][2];
	    	
	    	data[0][0]="firstfirstCombinamtion";
	    	data[0][1]="firstsecondCombinamtion";	
	    	data[1][0]="secondfirstCombinamtion";	
	    	data[1][1]="secondsecondCombinamtion";
	  
	    	return data;
	    }
	 
	@Test(dataProvider="getdata")
	public void LogNavigate(String userNamee , String Passwordd) throws IOException
	{
		driver=aDriveIntil();
		
		AaHomeObj   Ah=new AaHomeObj(driver);
      		Ah.aClick().click(); 

		AaLoginObject      Al=new AaLoginObject(driver); 
		    Al.LoginButtonClick().click();
		    
		   
		
		    
            Al.logName().sendKeys(userNamee );
            Al.logPassword().sendKeys(Passwordd);
            Al.LogInSubmit().click();
	
	}

}
