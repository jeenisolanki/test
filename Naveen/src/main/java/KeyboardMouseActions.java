import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 WebElement googlesearch=driver.findElement(By.name("q"));
		 Actions act= new Actions(driver);
		 act.keyDown(googlesearch, Keys.SHIFT ).sendKeys("selenium")
		 .keyUp(googlesearch, Keys.SHIFT)
		 .keyDown(googlesearch, Keys.CONTROL)
		 .sendKeys("a")
		 .keyDown(googlesearch, Keys.CONTROL)
		 .sendKeys("c")
		 .keyDown(googlesearch, Keys.CONTROL)
		 .sendKeys("c")
	     
		 .build()
		 .perform();
		 act.perform();
		 System.out.println("finish");
		 

	}

}
