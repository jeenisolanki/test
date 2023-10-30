package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By emailId=By.id("username");
	    Wait<WebDriver> Wait= new FluentWait<WebDriver>(driver).WithTimeout(Duration.ofSeconds(10)).PollingEvery(Duration,of.Secounds(2)))
								.ignoring(NoSuchElementExcetion.class)
	    						
	    						
	    	                      
	    
		
		

	}

}
