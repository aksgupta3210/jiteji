package aObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AaLoginObject {
	WebDriver driver;
	
	public AaLoginObject(WebDriver driver)
	{
		this.driver=driver;
	}

	By logClick= By.xpath("//span[normalize-space()='Login']");
    By Name=By.id("user_email");
    By Password=By.id("user_password");
    By submitt=By.xpath("//input[@type='submit']");
    
	public WebElement LoginButtonClick()
	{
		return driver.findElement(logClick);
	}
	public WebElement logName()
	{
		return driver.findElement(Name);
	}
	public WebElement logPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement LogInSubmit()
	{
		return driver.findElement(submitt);
	}
	
		
	}
	
	

