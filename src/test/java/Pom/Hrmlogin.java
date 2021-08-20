package Pom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogin {
	
public Menu menu=null;
	
	public  Hrmlogin(WebDriver driver) //page name
	{
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
	
	@FindBy(id="txtUsername")
	WebElement user;
	
	//creating POM for password
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	
	//creating POM for login button
	
	@FindBy(id="btnLogin")
	WebElement ok;
	
   public void login(String u,String p)
	{
		user.clear();
		user.sendKeys(u);
		password.clear();
		password.sendKeys(p);
		ok.click();

} 

}

 
