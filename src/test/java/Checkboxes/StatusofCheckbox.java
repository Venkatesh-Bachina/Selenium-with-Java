package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofCheckbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.spicejet.com/");
       List<WebElement>check= driver.findElements(By.xpath("//input[@type='checkbox']"));
       System.out.println("no of total checks"+""+check.size());
       for(int i= 0;i<check.size();i++)
       {
    	 String rname = check.get(i).getAttribute("name");
    	 
    	 if(check.get(i).isSelected())
    	 {
    		 System.out.println(rname+""+ "Active");
    	 }
    	 else {
    		 System.out.println(rname+""+ "unActive");
    	 }
       }
       driver.close();

}
}
