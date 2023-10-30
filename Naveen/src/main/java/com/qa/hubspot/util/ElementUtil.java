package com.qa.hubspot.util;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver=driver; 
	}
		
		public  WebElement getElement(By locator) {
				return driver.findElement(locator);
			
				
			}
		
		   public void doSendKeys(By locator,String value) {
			   getElement(locator).sendKeys(value);
		   }
		   
		   public void doClick(By locator) {
			   getElement(locator).click();
		
	}
		   
		   public  void doActionSendKeys(By locator,String value) {
				WebElement element =getElement(locator);
					Actions action = new Actions(driver);
					action.sendKeys(element, value).perform();
					
				}
				
				public void doActionsClick(By locator)
				{
					WebElement element =getElement(locator);
					Actions action =new Actions(driver);
					action.click(element).perform();
				}
				
				public boolean chekWebElementPresent(By locator) {
					int elementCount=driver.findElements(locator).size();
					System.out.println("total element count: "+elementCount + "for " +locator );
					
					if(elementCount>0) {
						return true;
					}
					else {
						return false;
					}
				
					}
		   
		   //********Drop Down utils*************
		   
		   public  void doDropdownSelectVisibleText(By locator,String value) {
				Select select =new Select(getElement(locator));
				select.selectByVisibleText(value);
			}
			
			public  void doDropdownSelectVisibleByValue(By locator,String value) {
				Select select =new Select(getElement(locator));
				select.selectByValue(value);
			}
			
			public void doDropdownSelectVisibleBiImdex(By locator,int index) {
				Select select =new Select(getElement(locator));
				select.selectByIndex(index);
			}



public  WebElement getElement1(By locator) {
	return driver.findElement(locator);
}

public  List<String> getAllDropdownOptions(By locator) {
	WebElement element = getElement(locator);
	List<String> optionsValueList = new ArrayList<String>();

	Select select = new Select(element);
	List<WebElement> optionsList = select.getOptions();

	for (int i = 0; i < optionsList.size(); i++) {
		String text = optionsList.get(i).getText();
		System.out.println(text);

	}
	return optionsValueList;
}

public  void getSelectValueFromDropdown(By locator, String value) {
	WebElement element = getElement(locator);
	Select select = new Select(element);
	List<WebElement> optionsList = select.getOptions();

	for (int i = 0; i < optionsList.size(); i++) {
		String text = optionsList.get(i).getText();
		if (text.equals(value)) {
			optionsList.get(i).click();
			break;
		}
	}
}
	
	public void selectDropDownWithoutSelec(By locator,String value) {
		List<WebElement> country_option_list=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		for(WebElement ele :country_option_list) {
			String text=(ele.getText());
			if(text.equals(value)) {
				ele.click();
				break;
			}
		}
		
		
	}

	public WebElement retryingElememt(By locator) {
		WebElement element=null;
		int attempts=0;
		while(attempts<30) {
			try {
				element=driver.findElement(locator);
						break;
			}
			catch(NoSuchElementException e) {
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e1) {
				}
				
				System.out.println("element is not found in attempt:" +(attempts));
				}
				attempts++;
		}
		return element;
			}
}


	

