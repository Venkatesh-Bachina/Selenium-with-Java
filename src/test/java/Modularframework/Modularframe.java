package Modularframework;

import org.testng.annotations.Test;

public class Modularframe {

@Test
	
	public void TC() throws InterruptedException
	{
		Reusablemethods	rm=new Reusablemethods();//created object
		
		rm.open();
		rm.login("Admin","admin123");
		Thread.sleep(2000);
		
		rm.logout();
		Thread.sleep(2000);
		rm.close();
		
	}
}