package Images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagescount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       List<WebElement>images= driver.findElements(By.tagName("img"));
       System.out.println("no of total images"+""+images.size());
       for(int i= 0;i< images.size();i++)
       {
    	   System.out.println(images.get(i).getAttribute("src"));
       }
       driver.close();

}
}
