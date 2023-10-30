import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Atidropdown {
//	public WebDriver driver = new ChromeDriver();
	public WebDriver driver;
	 
	public void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		dropDown();
	}
	public void dropDown() throws InterruptedException{
		WebElement bday=driver.findElement(By.id("Birthday_Day"));
		WebElement bmonth=driver.findElement(By.id("Birthday_Month"));
		WebElement byear=driver.findElement(By.id("Birthday_Year"));
		
		Select selectDay = new Select(bday);
		Select selectMonth = new Select(bmonth);
		Select selectYear = new Select(byear);
		 selectDay.selectByIndex(5);
		 Thread.sleep(3000);
		 selectMonth.selectByValue("July");
		 Thread.sleep(3000);
		 selectYear.selectByVisibleText("2011");
		 Thread.sleep(3000);
		 System.out.println("pass");
		 
		 WebElement firstSelectedItem=selectMonth.getFirstSelectedOption();
		System.out.println(firstSelectedItem.getText());
		
		List <WebElement> month=selectMonth.getOptions();
		System.out.println("totalMonthList");
		for(WebElement ele:  month){
			System.out.println(ele.getText());
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Atidropdown  ati = new Atidropdown ();
		ati.launch();
//		ati.dropDown();

	}

}
