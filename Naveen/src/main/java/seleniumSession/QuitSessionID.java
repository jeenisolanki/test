package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitSessionID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\js\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("page title is " +title);
		driver.quit();
		System.out.println(driver.getTitle());
	}
	}

