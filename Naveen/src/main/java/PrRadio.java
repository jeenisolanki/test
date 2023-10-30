import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrRadio {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		 Thread.sleep(3000);
		 driver.findElement(By.name("First_Name")).sendKeys("jeeni");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Last_Name")).sendKeys("solanki");
		 Thread.sleep(3000);
		 driver.findElement(By.name("State")).sendKeys("Maharashtra");
		 Thread.sleep(3000);
		 
		WebElement radiobtn= driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		Thread.sleep(2000);
		radiobtn.click();
		System.out.println("male btn is selected "+radiobtn.isSelected());
		 
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox' and @value='Drawing']"));
		for(int i=0;i<list.size();i++)
		{
			WebElement ele=list.get(i);
			String hobbies=ele.getAttribute("value");
			System.out.println(hobbies);
			if(hobbies.contains(hobbies)){
				ele.click();
				Thread.sleep(2000);
				 
				
			}
				WebElement bday=driver.findElement(By.id("Birthday_Day"));
				WebElement bmonth=driver.findElement(By.id("Birthday_Month"));
				WebElement byear=driver.findElement(By.id("Birthday_Year"));
				
				Select selectDay=new Select(bday);
				Select selectMonth=new Select(bmonth);
				Select selectYear=new Select(byear);
				
				selectDay.selectByIndex(5);
				Thread.sleep(1000);
				selectMonth.selectByValue("January");
				Thread.sleep(1000);
				selectYear.selectByVisibleText("1990");
				Thread.sleep(1000);
				System.out.println(" selected date month year");
				
				

		 
		}
	}

}
