package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul[@class='erkvQe']//span"));
		System.out.println(suggestionList.size());
		for(WebElement ele : suggestionList) {
			String text=ele.getText();
			if(text.equals("selenium ide")) {
				ele.click();
				break;
			}
		}
		
		
	}

}
