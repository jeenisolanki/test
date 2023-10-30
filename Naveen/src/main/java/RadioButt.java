import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButt {
	public WebDriver driver;
	public void launch(){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	}
	public void Radio(){
		WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio' and@value='Male']"));
		radiobtn.click();
		System.out.println("gender passed");
	}
	public void getcheckBox() throws InterruptedException{
//		WebElement checkbox =driver.findElement(By.xpath("//input[@type='checkbox' and@value='Drawing']"));
//		checkbox.click();
//	    System.out.println("drawing checkbox selected");
//		
//		WebElement checkbox1 =driver.findElement(By.xpath("//input[@type='checkbox' and@value='Singing']"));
//		checkbox1.click();
//		System.out.println("singing checkbox selected");
		
		List<WebElement> list =driver.findElements(By.xpath("//input[@type='checkbox' and  @name='Hobby']"));
		for(int i=0;i<list.size();i++){
			WebElement ele =list.get(i);
			String hobbies=ele.getAttribute("value");
			//System.out.println("all the values are " +hobbies);
			//i want to select some particular items
			if(hobbies.contains("Dancing")){
				ele.click();
				System.out.println("dancing selected");
				Thread.sleep(2000);
				break;
				
			}
		}
	}
	
	public void closeBrowse(){
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadioButt ra = new RadioButt();
		ra.launch();
		ra.Radio();
		ra.getcheckBox();
		

	}

}
