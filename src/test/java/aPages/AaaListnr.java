package aPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import aResouc.ABase;
import aResouc.AaRepott;

public class AaaListnr extends ABase implements ITestListener {

	AaRepott Aaa= new AaRepott();
	ExtentReports aexents = Aaa.aCon();
			
			public ExtentTest test;
			ThreadLocal <ExtentTest> ExtentTest=new ThreadLocal<ExtentTest>();
			
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	System.out.print("Start You work");
	
	
	
	test=aexents.createTest(result.getMethod().getMethodName());
	
	ExtentTest.set(test);

	}

	@Override
	 public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSuccess(result);
		ExtentTest.get().log(Status.PASS,"Test Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		
		test.fail(result.getThrowable());
		System.out.print("this test fail");
		
		String testMethodName=result.getMethod().getMethodName();
		WebDriver driver=null;
		
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			ExtentTest.get().addScreenCaptureFromPath(getScreenshotT(testMethodName,driver),result.getMethod().getMethodName());
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onFinish(context);
		
		System.out.print("work Finish");
		aexents.flush();
	}
	

}
