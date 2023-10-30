import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	    WebElement doubleclickbtn= driver.findElement(By.id("doubleClickBtn"));
	     Actions act = new Actions(driver);
	     act.doubleClick(doubleclickbtn).perform();
	     System.out.println("double clicked");
	     driver.switchTo().alert().accept();
	     Thread.sleep(2000);
	     act.contextClick(doubleclickbtn).perform();

	}

}
