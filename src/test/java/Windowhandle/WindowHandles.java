package Windowhandle;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandles {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		System.out.println("The title of mainwindow"+""+driver.getTitle());
	}
	@Test
	public void Windows() throws InterruptedException
	{
		 WebElement tabeedWindow= driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
	     tabeedWindow.click();
	     Thread.sleep(1000);
	     Set<String>windowIds = driver.getWindowHandles();
	     Iterator<String>iter = windowIds.iterator();
	     String mainWindow = iter.next();
	     String childWindow = iter.next();
	     driver.switchTo().window(childWindow);
	     System.out.println("The title of childwindow"+""+driver.getTitle());
	     driver.close();
	     Thread.sleep(1000);
	     driver.switchTo().window(mainWindow);
	     System.out.println("The title of mainwindow"+""+driver.getTitle());
	    
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	}  


