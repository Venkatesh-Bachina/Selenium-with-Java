package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visihiddlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.bing.com/");
       List<WebElement>links= driver.findElements(By.tagName("a"));
       int count = 0;
       for (int i = 0;i<links.size();i++)
       {
    	   if(links.get(i).isDisplayed())
    	   {
    		   count++;
    	   }
       }
       System.out.println("no of total links"+""+links.size());
       System.out.println("no of visibled links"+""+count);
       System.out.println("no of visibled links"+""+(links.size()-count));
       
	}

}//we can control test cases by using priority attribute and dependsOnMethods if we want to run the 
//test cases forcebully we use alwaysRun = true
