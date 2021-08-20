package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Namesofframes {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html\"");
		driver.manage().window().maximize();
	}
	@Test
	public void countofframe()
	{
		 List<WebElement>frame= driver.findElements(By.tagName("iframe"));
	     System.out.println("no of total frames"+""+frame.size());
	     for(int i=0;i<frame.size();i++)
	     {
	    	 System.out.println(frame.get(i).getAttribute("name"));
	     }
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	}

