package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.mercurytravels.co.in/");
       WebElement holiday = driver.findElement(By.id("themes"));
       holiday.sendKeys("family");
       Select st = new Select(driver.findElement(By.id("themes")));
       st.selectByIndex(4);
       driver.close();
       
}
}

