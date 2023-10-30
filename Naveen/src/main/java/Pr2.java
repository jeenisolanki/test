 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		 Thread.sleep(3000);
		 driver.findElement(By.name("First_Name")).sendKeys("jeeni");
		 driver.findElement(By.name("Last_Name")).sendKeys("Solanki");
		WebElement bday= driver.findElement(By.id("Birthday_Day"));
		WebElement bmonth= driver.findElement(By.name("Birthday_Month"));
		WebElement byear= driver.findElement(By.name("Birthday_Year"));
		 
		 Select selectbday = new Select(bday);
		 Select selectMonth = new Select(bmonth);
		 Select selectYear = new Select(byear);
		 
		 selectbday.selectByIndex(5);
		 selectMonth.selectByValue("June");
		 selectYear.selectByVisibleText("1990");
		 
		 Thread.sleep(1000);
		 WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		 radiobtn.click();
				 
		 List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox' and @value='Singing']"));
		
		 for(int i=0;i<check.size();i++){
			 WebElement ele=check.get(i);
			 String hobbies=ele.getAttribute("value");
			 if(hobbies.contains(hobbies)){
				 ele.click();
				 Thread.sleep(1000);
				 
			 }
			 
		 }
		 

	}

}
