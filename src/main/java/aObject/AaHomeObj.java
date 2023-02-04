package aObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AaHomeObj {
	
	WebDriver driver;

	public AaHomeObj(WebDriver driver)
	{
		this.driver=driver;
	}

	By aNoButton=By.xpath("//button[normalize-space()='NO THANKS']");

	public WebElement aClick()
	{
		return driver.findElement(aNoButton);
	}
}

