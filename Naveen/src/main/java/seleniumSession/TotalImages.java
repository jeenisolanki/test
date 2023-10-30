package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> imagesList =driver.findElements(By.tagName("img"));
		System.out.println("total images:" +imagesList.size());
		
		for(int i=0;i<imagesList.size();i++) {
			String source=imagesList.get(i).getAttribute("src");
			String altText=imagesList.get(i).getAttribute("alt");
			System.out.println(source);
		
			
		}

	}

}
