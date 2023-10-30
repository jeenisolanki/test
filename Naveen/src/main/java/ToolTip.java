import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/p/blog-page.html");
		WebElement Searchbox=driver.findElement(By.xpath("//input[@class='gsc-input']"));
		String TooltipText=Searchbox.getAttribute("title");
		System.out.println("tooltip text is "+TooltipText);
		driver.close();

	}

}
