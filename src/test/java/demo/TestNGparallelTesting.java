package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGparallelTesting {
	@Test
	public void test1() {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get("https://www.google.com/");
		       List<WebElement>links= driver.findElements(By.tagName("a"));
		       System.out.println("no of total links"+""+links.size());
		       driver.close();

		System.out.println(" I am inside Test1|"+ Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       List<WebElement>links= driver.findElements(By.tagName("a"));
       System.out.println("no of total links"+""+links.size());
       for(int i= 0;i<links.size();i++)
       {
    	   System.out.println(links.get(i).getText());
       }
       driver.close();
		System.out.println(" I am inside Test2|"+Thread.currentThread().getId());
		
	}

}
