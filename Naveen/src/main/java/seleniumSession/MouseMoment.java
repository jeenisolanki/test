package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMoment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		Thread.sleep(3000);
		WebElement Content_ParentMenu =driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
		action.moveToElement(Content_ParentMenu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
