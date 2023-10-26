package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static Logger lg;
	@BeforeClass
    public void setUp()
     {
		lg=LogManager.getLogger(this.getClass());
		loginpage();
	 }	
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
        Thread.sleep(2000);
		driver.quit();
	}
	
	public static void loginpage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions(); 
		op.addArguments("--disable-notifications");		
		driver=new ChromeDriver(op);
		driver.get("https://spiceclub.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='d-none d-lg-block']")).click();
		driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("7671964692");
		driver.findElement(By.id("password")).sendKeys("Admin@12345");
		driver.findElement(By.xpath("//div[@class='btn btn-red plr-50']")).click();		
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
	
	
	
	
}