package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assertion2 {
	@Test
	public void testMethod()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		SoftAssert softVerify = new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying title");
		String expectedTitle="Automation Testing Practice";
		String actualTitle=driver.getTitle();
		
		//Assert.assertEquals(actual, expected);
		softVerify.assertEquals(actualTitle, expectedTitle,"verifying");
		

		System.out.println("verification presence of wikipidia");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		softVerify.assertTrue(icon.isDisplayed());
		
		System.out.println("verification presence of wikipidia search btn");
		WebElement searchBtn=driver.findElement(By.className("verification presence of wikipidia"));
		softVerify.assertTrue(searchBtn.isDisplayed());
			
		driver.close();
		softVerify.assertAll();
		
		
		
		
		
	}

}
 