package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@class='nav-item']//button[contains(text(),'BOOK NOW')]")
	WebElement booknow_btn;
	
	
	public void clickbooknow_btn()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		js.executeScript("arguments[0].click()", booknow_btn);
		//booknow_btn.click();
	}

}
