

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public WebDriver driver;
	public void launch(){
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	String Title= driver.getTitle();
	System.out.println("Title is "+Title);
	System.out.println("student registration");
	}
	public void dropDown() throws InterruptedException{
		System.out.println("inside dropdown");
		WebElement bday=driver.findElement(By.id("Birthday_Day"));
		WebElement bmonth=driver.findElement(By.id("Birthday_Month"));
		WebElement byear=driver.findElement(By.id("Birthday_Year"));
		
		Select selectday = new Select(bday);
		Select selecttMonth = new Select(bmonth);
		Select selectyear = new Select(byear);
		
		selectday.selectByIndex(4);
		Thread.sleep(2000);
		selecttMonth.selectByValue("January");
		selecttMonth.selectByValue("March");
		Thread.sleep(2000);
		selectyear.selectByVisibleText("1980");	  
		System.out.println("create dropdown");
		
		WebElement firstlselecteditem=selecttMonth.getFirstSelectedOption();
		System.out.println(firstlselecteditem.getText());
		
		List<WebElement> monthList=selecttMonth.getOptions();
		System.out.println("TOTAL MONTHS ARE "+monthList);
		for(WebElement ele:monthList){
			System.out.println(ele.getText());
			
		}
		
		 
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DropDown dd = new DropDown();
		dd.launch();
		dd.dropDown();
	}
 
	
}
