import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		 driver.findElement(By.id("bootstrapmenu")).click();
		 Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.xpath("//ul[@ class='dropdown-menu']//li/a"));
				 for(WebElement ele:options){
					 String value=ele.getText();
					 System.out.println(value);
					 if(value.contains("ABOUT US")){
						 ele.click();
						 break;
					 }
			 }
				 String title=driver.getTitle();
				 System.out.println("title is " +title);
				 String url=driver.getCurrentUrl();
				 System.out.println(url);
		 
	 
		 
	}
}


