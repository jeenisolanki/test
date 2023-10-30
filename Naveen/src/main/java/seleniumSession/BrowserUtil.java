package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	 
	public WebDriver int_driver(String browser) {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
		}
			else {
				System.out.println("please pass the currect browser " +browser);
			}
			return driver;
	
	}
	}


