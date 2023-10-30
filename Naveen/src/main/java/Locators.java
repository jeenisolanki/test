import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/resources/courses&hubs_signup-cta=homepage-nav-login");
		//Thread.sleep(5000);
	//1
//		driver.findElement(By.id("username")).sendKeys("admin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("admin@234");
//		driver.findElement(By.id("loginBtn")).click();
//	//2	
//		WebElement emailid=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		emailid.sendKeys("admin21@gmail.com");
//		password.sendKeys("admin@123");
//		loginButton.click();
	//3
//		By username=By.id("username");
//		By password=By.id("password");
//		By loginbutton=By.id("loginBtn");
//		WebElement emailid=driver.findElement("username");
//		WebElement password=driver.findElement("password"));
//    	WebElement loginButton=driver.findElement(By.id("loginBtn"));
//    	emailid.sendKeys("amit123@gmail.com");
//    	password.sendKeys("admin@123");
//    	loginButton.click();
		
	//4
//		getElement(username).send
//		getElement(pwd).sendkeys("");
//		getElement(loginButton).sendkeys("");
//	}
//		doSendKeys(username,"admin@gmail.com");
//		doSendKeys(password "admin123");
//		doClick(loginButton);
//		
	public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		
			
		}
	
	   public static  void doSendKeys(By locator,String value) {
		   getElement(locator).sendKeys(value);
	   }
	   
	   public static void doClick(By locator) {
		   getElement(locator).click();
	   }
		
		
		
		
		
	}


