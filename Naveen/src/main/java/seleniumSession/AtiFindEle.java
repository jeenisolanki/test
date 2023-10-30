package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AtiFindEle {
	WebDriver driver;
	public void demo() throws InterruptedException{
		 WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio'and @value='Male']"));
				radiobtn.click();
				System.out.println("male radio btn"+radiobtn.isSelected());
				System.out.println("pass");
				Thread.sleep(2000);
	}
	public void checkBox() throws InterruptedException{
		 List<WebElement>list=driver.findElements(
				 By.xpath("//input[@type='checkbox' and @name='Hobby']"));
		for(int i=0;i<list.size();i++){
			WebElement ele=list.get(i);
			String hobbies =ele.getAttribute("value");
			System.out.println("all the hobbies are "+hobbies);
			Thread.sleep(2000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		Thread.sleep(6000);
		driver.findElement(By.name("First_Name")).sendKeys("jeeni");
		Thread.sleep(2000);
		driver.findElement(By.name("Last_Name")).sendKeys("solanki");
		Thread.sleep(2000);
		driver.findElement(By.name("Email_Id")).sendKeys("jeenalkankariya91@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Mobile_Number")).sendKeys("268544");
		AtiFindEle at = new AtiFindEle();
		at.demo();
		at.checkBox();
		
	}

}
