package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ati {
	WebDriver driver;
	 
	public void launch() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void demo() throws InterruptedException{
		 WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio'and @value='Male']"));
				radiobtn.click();
				//System.out.println("male radio btn"+radiobtn.isSelected());
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
			if(hobbies.contains("Dancing")){
				ele.click();
				Thread.sleep(2000);
				break;
			}
			Thread.sleep(2000);
		}
	}
	public void close(){
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Ati at = new Ati();
		at.launch();
		at.demo();
		at.checkBox();
	
	

	}

}
