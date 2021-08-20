package Webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Countofrowsandcolums {
	
	WebDriver driver;	
@BeforeTest
public void open()
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
}
@Test
public void countrowsandcolumns()
{
	 List<WebElement>tablesrow= driver.findElements(By.tagName("tr"));
     System.out.println("no of total tables"+""+tablesrow.size());
     List<WebElement>tablescol= driver.findElements(By.tagName("td"));
     System.out.println("no of total tables"+""+tablescol.size());
}
@AfterTest
public void close()
{
	driver.close();
}
}
