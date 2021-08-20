package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get("https://www.google.com/");
		       WebElement header = driver.findElement(By.id("gb"));
		       List<WebElement>headerlinks= header.findElements(By.tagName("a"));
		       System.out.println("no of total links"+""+headerlinks.size());
		       for(int i= 0;i<headerlinks.size();i++)
		       {
		    	   System.out.println(headerlinks.get(i).getText());
		       }
		       driver.close();
	}

}
