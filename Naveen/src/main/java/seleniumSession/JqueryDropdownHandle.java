package seleniumSession;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.id("justAnInputBox")).click();
	Thread.sleep(2000);
//	List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//	for(int i=0;i<choiceList.size();i++) {
//		String text=choiceList.get(i).getText();
//		System.out.println(text);
//		if(text.equals("choice 6 1")) {
//			choiceList.get(i).click();
//			break;
//		}
	
	By choices_span=(By.xpath("//span[@class='comboTreeItemTitle']"));
//	selectChoicwFromdropdown(choices_span,"choice 2");
//	selectChoicwFromdropdown(choices_span,"choice 6");
//	selectChoicwFromdropdown(choices_span,"choice 6 2");
	
	//selectChoicwFromdropdown(choices_span,"choice 6 2","choice 3","choice 2");  //multiselection
	
	//select all
	 selectChoicwFromdropdown(choices_span, "all");
	}
		
		
	
//	public static void selectChoicwFromdropdown(By locator,String... value)
//	{
//		 List<WebElement>choiceList =driver.findElements(locator);
//			for(int i=0;i<choiceList.size();i++) {
// 				String text=choiceList.get(i).getText();
// 				System.out.println(text);
// 				for(int j=0;j<value.length;j++)    //for only array
// 				{
// 				if(text.equals(value[j])) {        //for array j otherwise remaon blank brecket
// 					choiceList.get(i).click();
// 					break;
// 				}
			 
//	}
	//}
	

//}

public static void selectChoicwFromdropdown(By locator,String... value)  {

	 List<WebElement>choiceList =driver.findElements(locator);
	 
	if(!value[0].equalsIgnoreCase("all")) {
		
	
	for(int i=0;i<choiceList.size();i++) {
				String text=choiceList.get(i).getText();
				System.out.println(text);
				for(int j=0;j<value.length;j++)    //for only array
				{
				if(text.equals(value[j])) {        //for array j otherwise remaon blank brecket
				choiceList.get(i).click();
				break;
			}
	}JUL
	}
	

	
	}
	//select all value   	
      else {
    	  try{
    	  for(int a=0;a<choiceList.size();a++) {
    		  choiceList.get(a).click();
    	  }
    		  
      }

	catch(Exception e){
	
}
      }
}
}
    	  
      


