import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 List<WebElement> listName=driver.findElements(By.tagName("iframe"));
		  int totalFrames=listName.size();
		  System.out.println("total frame is "+totalFrames);
		  for(WebElement iframe:listName){
			  System.out.println(iframe.getAttribute("name"));
			  if(iframe.getAttribute("name").equals("iframe_b"));
			  driver.switchTo().frame("iframe_b");
			  driver.findElement(By.id("searchInput")).sendKeys("iframr Testing");
			  driver.switchTo().defaultContent();
	        }
		  			boolean btnDisplayed=driver.findElement(By.id("simpleAlert")).isDisplayed();
		  			System.out.println(btnDisplayed);
	}
				
	
}
