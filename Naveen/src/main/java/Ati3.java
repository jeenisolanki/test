import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ati3 {
	 public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.findElement(By.name("proceed")).click();
		  Thread.sleep(5000);
		 Alert aler= driver.switchTo().alert();
		String text= aler.getText();
		System.out.println("text");
		if(text.contains("Please enter a valid user name"));
		System.out.println("correct popup msg");
		aler.accept();
     
	}

}
