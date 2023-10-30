package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandleWithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
		By country_options=(By.xpath("//select[@id='Form_getForm_Country']/option"));
		selectDropDownWithoutSelec(country_options,"india");
		List<WebElement> country_option_list=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		for(WebElement ele :country_option_list) {
			System.out.println(ele.getText());
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void selectDropDownWithoutSelec(By locator,String value) {
		List<WebElement> country_option_list=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		for(WebElement ele :country_option_list) {
			String text=(ele.getText());
			if(text.equals(value)) {
				ele.click();
				break;
			}
		}
		
	}

}
