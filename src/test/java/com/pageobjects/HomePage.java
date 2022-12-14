package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		
	super(driver);
	}
		@FindBy(xpath = "//span[text()='My Account']") public WebElement Myaccountlnk;
		@FindBy(linkText = "Register") public WebElement Registerbtn;
		@FindBy(xpath = "//a[normalize-space()='Login']") public WebElement loginbtn;  
		
		public void clickRegisterlnk() {
			Myaccountlnk.click();
			 Actions action= new Actions(driver);
			 action.moveToElement(Myaccountlnk).perform();
			 Registerbtn.click();
		}
		public void clickLoginlnk() {
			Myaccountlnk.click();
			 Actions action= new Actions(driver);
			 action.moveToElement(Myaccountlnk).perform();
			loginbtn.click();

		}
}