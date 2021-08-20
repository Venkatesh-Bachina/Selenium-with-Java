package ExtentReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Orangehrm extends BaseClass{
	@Test
	 public void loginTest() {
	  test=extent.createTest("loginTest");
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	        String actualTitle=driver.getTitle();
	        String expectedTitle="OrangeHRM";
	        Assert.assertEquals(actualTitle, expectedTitle);

}
	@Test
	 public void sampleCase() {
	  test=extent.createTest("sampleCase");
	  test.createNode("Validation1");
	  Assert.assertTrue(false);
	  
	 }
}
