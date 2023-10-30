import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr5 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/droppable/");
		 Thread.sleep(2000);
	WebElement from	= driver.findElement(By.id("draggable"));
		WebElement to= driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();
		act.dragAndDropBy(from, 133, 22).perform();
	 act.clickAndHold(from).moveToElement(to).release().build().perform();
	 WebElement droppedmsg=driver.findElement(By.xpath("//div/p[text()='Dropped!']"));
	 if( droppedmsg.isDisplayed()){
		 System.out.println("success");
		System.out.println("msg is" +droppedmsg.getText());
	 }
		else{
			System.out.println("failed");
			Thread.sleep(1000);
			
		}
		 
	 }
	}
	
