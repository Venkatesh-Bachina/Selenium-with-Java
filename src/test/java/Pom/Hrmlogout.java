package Pom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogout {
	
public Menu menu=null;
	
	public Hrmlogout(WebDriver driver) //page name
	{
		menu=PageFactory.initElements(driver, Menu.class);
	}

	@FindBy(id="welcome")
	WebElement drop;
	
	@FindBy(linkText="Logout")
	WebElement loginout;
	
	public void logout() throws InterruptedException
	{
		drop.click();
		Thread.sleep(1000);
		loginout.click();
		Thread.sleep(100);
	}

}

