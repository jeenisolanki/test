import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println("open browser");
		driver.findElement(By.id("email")).sendKeys("jeenalkankariya");
		System.out.println("email id");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("8625887411");
		System.out.println("password");
		Thread.sleep(5000);
		System.out.println("login succesfull");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();


	}

}
