package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaynamicWaitWithCustomWait {
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		By start= By.cssSelector("div#start button");
		By helloWorldText = By.cssSelector("div#finish");
		
		ElementUtil eleUtil =new ElementUtil(driver);
		eleUtil.retryingElememt(start).click();
		Thread.sleep(8000);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		String text= wait.until(ExpectedConditions.presenceOfElementLocated(helloWorldText)).getText();
		System.out.println(text );
		
		wait.until(ExpectedConditions.textToBe(helloWorldText, "Hello World"));
		System.out.println(driver.findElement(helloWorldText).getText());	
		

	}

}
