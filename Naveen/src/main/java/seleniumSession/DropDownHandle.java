package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
		//WebElement industry=driver.findElement(By.id("Form_submitForm_industry"));
		//WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		
		//Select select_ind= new Select(industry);
	//	select_ind.selectByIndex(5);
		//select_ind.selectByVisibleText("Electronics");
		//select_ind.deselectByValue("Education");
		//Select select_country = new Select(country);
		//select_country.selectByVisibleText("Belgium");
	
		
//	By industry=By.id("Form_getForm_NoOfEmployees");
	By country=By.id("Form_getForm_Country");
//		doDropdownSelectVisibleText(industry,"helthcare");
	doDropdownSelectVisibleText(country,"Belgium");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doDropdownSelectVisibleText(By locator,String value) {
		Select select =new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doDropdownSelectVisibleByValue(By locator,String value) {
		Select select =new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doDropdownSelectVisibleBiImdex(By locator,int index) {
		Select select =new Select(getElement(locator));
		select.selectByIndex(index);
	}


	

}
