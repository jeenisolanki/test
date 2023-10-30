import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrengeHrmTEST {
	WebDriver driver;
	@BeforeClass
	public void serup(){
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
	}
	
	@Test
	public void launchApp(){
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//boolean img1=driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		//Assert.assertTrue(img1);
     }
	
	public void loginTest(){
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		System.out.println("method passed");
		
	}
	@Test
	public void currentUrl(){
		String url=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index ";
		Assert.assertEquals(url, expectedUrl);
	}
	@Test
	public void titleTest(){
		String actualtitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualtitle, expectedTitle);
		 
	}
	public void logOut() throws InterruptedException{
		driver.findElement(By.className("oxd-userdropdown-tab"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[te]xt()='Logout'"));
		String actualUrl=driver.getCurrentUrl();
		String expectedUr="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	}
	public void tearDown(){
		driver.close();
		
	}
}
