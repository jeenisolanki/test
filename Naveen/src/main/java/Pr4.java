import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr4 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  Thread.sleep(3000);
		  WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		  WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		  
		  Actions act = new Actions(driver);
		  act.doubleClick( doubleclick).perform();
		   System.out.println("double clicked");
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(1000);
		   act.contextClick(rightclick).perform();
		   Thread.sleep(1000);
	}

}
