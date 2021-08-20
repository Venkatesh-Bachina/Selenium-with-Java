package Alerts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {
	
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert()
	{
		  driver.findElement(By.id("searchBtn")).click();
	      String value = driver.switchTo().alert().getText();
	      System.out.println(value);
	      driver.switchTo().alert().accept();;
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	}


