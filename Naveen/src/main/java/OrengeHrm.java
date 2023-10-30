import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrengeHrm {
	WebDriver driver;
	public void launchBrowser() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("orenge hrm is open");
		
		 }

	
	public void Login(String username,String password ) throws InterruptedException   {
		//Thread.sleep(5000);
		System.out.println("login");
		//Thread.sleep(5000);
		driver.findElement(By.className("oxd-input"));
		System.out.println("username passed");
		Thread.sleep(5000);
		driver.findElement(By.name("password"));
		System.out.println("password passed");
		driver.findElement(By.className("oxd-button")).click();
		System.out.println("login success");
	}

	public void getTitle() 
	{
		
		System.out.println("title open");
		//Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println("title is "+title);
		}
	
	
//	public void logout(){
//		driver.findElement(By.className("oxd-userdropdown-link")).click();
//		System.out.println("successfully logout");
//	}
	
	public void getclose(){
		
		driver.close();
		System.out.println("driver is closed");
	}
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		OrengeHrm hm = new OrengeHrm();
		hm.launchBrowser();
		//Thread.sleep(5000);
	 
		
		hm.Login("Admin","admin123");
		 hm.getTitle();
		//Thread.sleep(5000);
		
		//hm.logout();
		hm.getclose();
		

	}

}
