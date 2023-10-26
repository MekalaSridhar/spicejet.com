package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Booknow_001 extends BaseClass {
	
	@Test(priority=1)
	void booknow() throws InterruptedException
	{
		lg.info("booknow_001 test case is started");
		HomePage hp=new HomePage(driver);
		lg.info("clicked on booknow button succesfully");
		hp.clickbooknow_btn();
		lg.info("test case is completed");
	}

}
