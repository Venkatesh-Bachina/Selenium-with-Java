package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitlelink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       driver.findElement(By.linkText("Gmail")).click();
       String expected = "Gmail";
       String actual = driver.getTitle();
       System.out.println(actual);
       if(expected.contains(actual))
       {
    	   System.out.println("pass");
       }
       else {
    	   System.out.println("fail");
       }
       driver.close();

	}

}
