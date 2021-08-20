package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownvaluesActive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.mercurytravels.co.in/");
       WebElement holiday = driver.findElement(By.id("themes"));
       List<WebElement>values= holiday.findElements(By.tagName("option"));
       System.out.println("no of total values"+""+values.size());
       for(int i=0 ;i<values.size();i++)
       {
    	String name= values.get(i).getText();
    	values.get(i).click();
    	if(values.get(i).isDisplayed())
    	{
    		 System.out.println(name+""+ "Active");
    	}
    	else
    	{
    		System.out.println(name+""+"unActive");
    	}
    	   
       }
       driver.close();

}
}

