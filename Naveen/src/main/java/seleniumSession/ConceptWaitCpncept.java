 package seleniumSession;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptWaitCpncept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		By emailId=By.id("username");
		
	WebElement ele=retryingElememt(emailId);
	ele.sendKeys("test@gmail.com");
	driver.navigate().refresh();
	//WebElement ele1=retryingElememt(emailId);
	ele.sendKeys("test11@gmail.com");

	}

	}


