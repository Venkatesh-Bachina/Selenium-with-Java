package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Steps {
	
	@Test
	public void operation() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
				
		//To call login POM class File
				
	Hrmlogin page1=PageFactory.initElements(driver,Hrmlogin.class); //  create an object
	
	Hrmlogout page2=PageFactory.initElements(driver,Hrmlogout.class);
   
	page1.login("Admin","admin123");
	
	page2.logout();
	
	driver.close();
 
		

	}
}
