package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdowmOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
//		List<String> country_List = getAllDropdownOptions(country);
//		System.out.println(country_List.size());
//		System.out.println(country_List);
		getSelectValueFromDropdown(country, "india");

		// WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		// Select country_select=new Select(country);
		// List<WebElement> country_option_list = country_select.getOptions();
		// System.out.println(country_option_list.size());
		// for(int i=0;i<country_option_list.size();i++) {
		// String text=country_option_list.get(i).getText();
		// System.out.println(text);
		// if(text.equals("china")) {
		// country_option_list.get(i).click();
		// break;
		// }
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getAllDropdownOptions(By locator) {
		WebElement element = getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(text);

		}
		return optionsValueList;
	}

	public static void getSelectValueFromDropdown(By locator, String value) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}

		}

	}

}
