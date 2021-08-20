package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofDropdowns {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.mercurytravels.co.in/");
	       List<WebElement>dropdowns= driver.findElements(By.tagName("select"));
	       System.out.println("no of total dropdowns"+""+dropdowns.size());
	       driver.close();
	}

}
