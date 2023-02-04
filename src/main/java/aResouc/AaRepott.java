package aResouc;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AaRepott {
	
	public WebDriver driver;
	public ExtentSparkReporter arepoo;
	public ExtentReports aexents;
	
	
	public ExtentReports aCon()
	{
		String apath=System.getProperty("user.dir")+"\\areportss\\index.html";
		arepoo=new ExtentSparkReporter(apath);
		arepoo.config().setReportName("aWebAuto");
		arepoo.config().setDocumentTitle("a Result");
		aexents= new ExtentReports();
		aexents.attachReporter(arepoo);
		aexents.setSystemInfo("tester", "Er.Aaksh");
		return aexents;
		
		
	}
}
