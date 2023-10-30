package seleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	static WebDriver driver;
       public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
	    	WebDriverManager.chromedriver().setup();
	   		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//String filename = "jeeni";				
		//take_screenshot(filename);
		
		String filname1="aaru";
		tScreenshot(filname1);
	}
//	private static void take_screenshot(String filename) throws IOException {
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("E:/CJC_Java/Eclipse_workspace/Naveen/src/main/java/seleniumSession/"+filename+".png"));
//	}
	
	private static void tScreenshot(String filname1) throws IOException
	{
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("E:/CJC_Java/Eclipse_workspace/Naveen/src/main/java/seleniumSession/"+filname1+".png"));;
	}
	

	}


