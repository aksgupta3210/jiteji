package aResouc;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ABase {
	
	WebDriver driver;
	Properties pro;
	public WebDriver aDriveIntil() throws IOException
	{
		pro =new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Win_!0\\eclipse-workspace\\GooDGoverment\\src\\main\\java\\aResouc\\aConn.Properties");
		pro.load(fs);
		
		String BrowserNames= pro.getProperty("browser");
				{
					if(BrowserNames.equals("chrome"))
					{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win_!0\\Downloads\\chromedriver_win32 (19)\\chromedriver.exe");
		driver=new ChromeDriver();
			
					}
					driver.get(pro.getProperty("url"));
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				}
		
		
		return driver;
	}
	public String getScreenshotT(String TestCaseName ,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File Source= ts.getScreenshotAs(OutputType.FILE);
		String DestFile= System.getProperty("user.dir")+"\\NewsreporttScreensot\\"+TestCaseName+".png";
		FileUtils.copyFile(Source, new File(DestFile));
		return DestFile;
	}
	 
	
}
