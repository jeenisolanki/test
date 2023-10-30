package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By username=By.id("username");
		By password=By.id("password");
		By loginbtn=By.id("loginbtn");
		
		System.out.println(chekWebElementPresent(username));
		System.out.println(chekWebElementPresent(password));
		System.out.println(chekWebElementPresent(loginbtn));
		
		
//		List <WebElement> loginbtnlist=driver.findElements(By.id("loginBtn"));
//		System.out.println(loginbtnlist.size());
//		
//		if(loginbtnlist.size()>0)
//		{
//			System.out.println("element is present on the web page");
//			
//		}
//		else{
//			System.out.println("element is not present in web oage");
//		}
//		

	}
	
	//public static WebElement getElement(By locator) {
		//return driver.findElement(locator);
	//}
	
	public static boolean chekWebElementPresent(By locator) {
		int elementCount=driver.findElements(locator).size();
		System.out.println("total element count: "+elementCount + "for " +locator );
		
		if(elementCount>0) {
			return true;
		}
		else {
			return false;
		}
	
		}
		
	}

