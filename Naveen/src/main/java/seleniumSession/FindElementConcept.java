package seleniumSession;

import java.net.SocketOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("total links " +linklist.size());
		for(int i=0;i<linklist.size();i++)
		{
			String text=linklist.get(i).getText();
			System.out.println(text);
			if(!text.isEmpty()) {
				System.out.println(i+"--->"+text);
			System.out.println(linklist.get(i).getAttribute("href"));
			}
				
			}
		}

	}

