package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class Login01 extends BaseClass {
	
	
	@Test(priority=1)
	public void loginapp() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();		
	}

}
