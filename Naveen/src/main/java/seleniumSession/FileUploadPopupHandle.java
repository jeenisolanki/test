package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopupHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		//driver.findElement(By.id("file-upload")).sendKeys("E:/js/DataDemo.xlsx");
		driver.findElement(By.id("file-upload")).sendKeys("C:/Users/hp/Desktop/1111.docx");

	}

}
