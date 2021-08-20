package Webtables;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datafromparticularrowandcolumn {
	
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
		 String value1 = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[7]/a")).getText();
		 System.out.println(value1);
		 String value2 = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a")).getText();
		 System.out.println(value2);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}

