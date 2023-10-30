import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		List<WebElement> options= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(WebElement ele :options)
		{
			String value=ele.getText();
			System.out.println("value is "+value);
			if(value.equalsIgnoreCase("contact us")){
				ele.click();
				break;
			}
		}

	}

}
