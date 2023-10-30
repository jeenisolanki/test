package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		By username = By.id("username");
		By password = By.id("password");
		By loginbutton = By.id("loginBtn");
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.int_driver("chrome");
//		br.lauchUrl("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/resources/courses&hubs_signup-cta=homepage-nav-login");
		Thread.sleep(5000);
//		System.out.println(br.getPageTitle());
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(username, "admin123@gmail.com");
		ele.doSendKeys(password, "admin123");
		ele.doClick(loginbutton);

	}

}
