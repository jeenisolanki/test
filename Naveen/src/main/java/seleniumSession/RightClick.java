package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe_button=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickMe_button).perform();
		Thread.sleep(2000);
		//List<WebElement> right_Click_Option_List = driver.findElements(By.xpath("//li[contains@class,'context-menu-icon')]/span"));
		List<WebElement>  right_Click_Option_List = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
		
		System.out.println(right_Click_Option_List.size());
		
		for (WebElement ele : right_Click_Option_List) {
			String text=ele.getText();
			System.out.println(text);
			if(text.equals("copy")) {
				ele.click();
				break;
			}
		}

	}

}
