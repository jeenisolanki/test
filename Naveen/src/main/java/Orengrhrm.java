import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orengrhrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println("title is "+title);
		Thread.sleep(5000);
     	driver.findElement(By.className("oxd-input")).sendKeys("Admin");

     	System.out.println("username passed");
//		System.out.println("password passed");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button")).click();
//		System.out.println("login success");
		//Thread.sleep(5000);
		String text =driver.findElement(By.linkText("Forgot your password?")).getText();
		System.out.println("text");
		System.out.println("linked login");
		driver.close();

	}

}
