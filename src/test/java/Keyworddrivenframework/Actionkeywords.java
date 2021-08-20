package Keyworddrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeywords {
    WebDriver driver;//instance variable
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void navigate() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	public void enterusername()
	{
        driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	public void enterpassword()
	{
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	public void clickonlogin()
	{
	
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void logout() throws InterruptedException
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
    public void close()
	
	{
		driver.close();
	}

}
