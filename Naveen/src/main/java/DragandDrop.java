import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		 
		WebElement from = driver.findElement(By.id("draggable"));
		System.out.println("form");
		WebElement too = driver.findElement(By.id("droppable"));
		System.out.println("deag and drop");
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(from, too).perform();
		
		
		//act.dragAndDropBy(from, 138, 24).perform();
		act.clickAndHold(from)
		.moveToElement(too)
		.release()
		.build()
		.perform();
		System.out.println("finish");
		//Thread.sleep(1000);
		driver.close();
		
	}

}
