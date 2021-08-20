package Webtables;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CountofTables {
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
public void counttables()
{
	 List<WebElement>tables= driver.findElements(By.tagName("table"));
     System.out.println("no of total tables"+""+tables.size());
}
@AfterTest
public void close()
{
	driver.close();
}


}