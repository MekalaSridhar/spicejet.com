package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='d-none d-lg-block']")
	WebElement login_btn;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobile_inputbox;
	
	@FindBy(id="inlineRadio2")
	WebElement email_radio;
	
	@FindBy(id="password")
	WebElement password_inputbox;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email_inputbox;
	
	@FindBy(xpath="//div[@class='btn btn-red plr-50']")
	WebElement submit_button;
	
	public void clickloginbtn()
	{
		login_btn.click();
	}
	
	public void clicksubmitbtn()
	{
		submit_button.click();
	}
	
	public void emailradio()
	{
		email_radio.click();
	}
	
	public void mobilenumber(String number)
	{
		mobile_inputbox.sendKeys(number);
	}
	
	public void emailsetting(String email)
	{
		email_inputbox.sendKeys(email);
	}
    public void password(String password)
    {
    	password_inputbox.sendKeys(password);
    }
}
