package Propertiesfile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithrepositories {
	WebDriver driver;
	FileInputStream fis;
	Properties pr123;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
}
@Test(priority=1)
	
	public void objdata() throws IOException 
	{
	    fis=new FileInputStream("C:\\Users\\BachinaVenkatesh\\eclipse-workspace\\SeleniumprojectDemo\\HRMLogin.properties");
		pr123=new Properties();
		pr123.load(fis);
		
		
		
		driver.findElement(By.id(pr123.getProperty("user"))).sendKeys("admin");
		
		
		driver.findElement(By.id(pr123.getProperty("pwd"))).sendKeys("admin123");
        
		driver.findElement(By.id(pr123.getProperty("login"))).click();
	}
@Test(priority=2)
public void logout() throws IOException, InterruptedException
{
	fis=new FileInputStream("C:\\Users\\BachinaVenkatesh\\eclipse-workspace\\SeleniumprojectDemo\\HRMLogin.properties");
	pr123=new Properties();
	pr123.load(fis);
	
	driver.findElement(By.id(pr123.getProperty("dropdown"))).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText(pr123.getProperty("logout"))).click();
	driver.close();
	
	
}


		
}
