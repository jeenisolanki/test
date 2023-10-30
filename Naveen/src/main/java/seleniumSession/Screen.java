package seleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
   		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
   		driver.get("https://in.search.yahoo.com/?fr2=inr");
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src,new File("E:/CJC_Java/Eclipse_workspaceNaveen/src/main/java/seleniumSession/screen.png"));
    		   
       
    		 
	}

}
