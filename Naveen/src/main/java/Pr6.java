import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr6 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 Thread.sleep(4000);
		 driver.findElement(By.id("simpleAlert")).click();
		 Alert alert =driver.switchTo().alert();
		 String alerttext=alert.getText();
		 System.out.println("alert text is"+alerttext);
		 Thread.sleep(3000);
		 alert.accept();
		 driver.close();
		 
		 
		 
		  
		
	
		
	}
}

