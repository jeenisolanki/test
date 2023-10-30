package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
	    String text =alert.getText();
	    System.out.println(text);
	    if(text.equals("please enter a valid username")) {
	    	System.out.println("correct validatio");
	    }
	    alert.accept();//ok button
	  //  alert.dismiss();//cancell button
	    driver.switchTo().defaultContent();
	    
	
		

	}

}
