package Log4jframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Worklog {
	
	private static Logger log=Logger.getLogger(Worklog.class);
	ChromeDriver driver; //instance variable
	FileInputStream fis;
	Properties pr123;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		log.info("chrome browser is opened");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		log.info("navigate to orangeHRm application");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}	
	
	@Test(priority=1)
	
	public void objdata() throws IOException
	{
	    fis=new FileInputStream("C:\\Users\\BachinaVenkatesh\\eclipse-workspace\\SeleniumprojectDemo\\HRMLogin.properties");
		pr123=new Properties();
		pr123.load(fis);
		
		log.info("successfully properties ar imported");
		
		driver.findElement(By.id(pr123.getProperty("user"))).sendKeys("admin");
		log.info("username inserted succesfully");
		
		driver.findElement(By.id(pr123.getProperty("pwd"))).sendKeys("admin123");
        log.info("password inserted successfully");

		driver.findElement(By.id(pr123.getProperty("login"))).click();
		log.info("logged in successfully");
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
		
		log.info("logged out successfully");
	}

}
