package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Everylinknameurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.bing.com/");
       List<WebElement>links= driver.findElements(By.tagName("a"));
       
       for (int i = 0;i<links.size();i++)
       {
    	   if(links.get(i).isDisplayed())
    	   {
    		  String lname = links.get(i).getText();
    		  links.get(i).click();
    		  String url = driver.getCurrentUrl();
    		  System.out.println(lname+""+url);
    		  driver.navigate().back();
    		  links= driver.findElements(By.tagName("a"));
    		  Thread.sleep(2000);
    		  
       }
    	  
	}
       driver.quit();

}
}
