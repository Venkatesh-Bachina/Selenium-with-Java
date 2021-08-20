package Checkboxes;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParicularcheckboxActive {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.spicejet.com/");
       Thread.sleep(1000);
       WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
       student.click();
       if(student.isSelected())
       {
    	  System.out.println("Working success");  
       }
       else 
       {
    	  System.out.println("Working unsuccess");
       }
       driver.close();

}
}
