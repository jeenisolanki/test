package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaynamicWaitConcept {
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
	   String text =eleUtil.retryingElememt(helloWorldText).getText();
	   System.out.println(eleUtil .getText());
		
		
		
		
	}

}
