package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionclickAndSendKeys { 
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		By username=By.id("username");
		By password=By.id("password");
		By loginbtn=By.id("loginbtn");
		
		doActionSendKeys(username,"jeeni@gnail.com");
		doActionSendKeys(password,"jeeni@");
		doActionsClick(loginbtn);
		 
		
		
//		WebElement emailid =driver.findElement(By.id("username"));
//		WebElement password =driver.findElement(By.id("password"));
//		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(emailid,"jeeikankariya@gmail.com").perform();
//		action.sendKeys(password,"jeeni@123").perform();
//		action.click(loginbtn).perform();
		
	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeys(By locator,String value) {
	WebElement element =getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
		
	}
	
	public static void doActionsClick(By locator)
	{
		WebElement element =getElement(locator);
		Actions action =new Actions(driver);
		action.click(element).perform();
	}
	}


