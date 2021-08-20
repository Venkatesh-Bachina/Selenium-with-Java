package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts2 {
	
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		driver.findElement(By.id("promptAlert")).click(); 
		driver.switchTo().alert().sendKeys("Yes");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	}


