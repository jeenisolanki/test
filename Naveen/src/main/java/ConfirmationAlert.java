import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlert {
	static WebDriver driver;
	
	public static boolean isAlertPresent(WebDriver ldriver){
		try{
			Alert alert=ldriver.switchTo().alert();
			String alertText=alert.getText();
			alert.accept();
		}
		catch(NoAlertPresentException e) {
		
	}
		return false;
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 Thread.sleep(4000);
		 driver.findElement(By.id("confirmationAlert")).click();,
		 
		 
		 
			 if (isAlertPresent(driver)) {
				   System.out.println("Alert is present");
				  } else {
				   System.out.println("Alert is not present");
				  }
				  driver.close();
				 }
		 

	}

