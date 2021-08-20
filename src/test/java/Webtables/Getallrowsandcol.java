package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Getallrowsandcol {
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
		String part1 = "/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2 = "]/td[";
		String part3 = "]";
		 for(int i=1;i<37;i++)
		 {
			for(int j=1 ;j<=8;j++)
			 {
				 
			String value= driver.findElement(By.xpath(part1+i+part2+j+part3)).getText(); 
			System.out.println(value);
		 }
			System.out.println();
	}
		 
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}


