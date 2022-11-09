package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		}
			
	@FindBy(xpath = "//input[@id='input-email']") public WebElement txtemail;
	@FindBy(xpath = "//input[@id='input-password']") public WebElement txtpwd;
	@FindBy(xpath = "//button[@type='submit']") public WebElement submitbtn;
	
	
	public void SetEmail(String email) {
		txtemail.sendKeys(email);
		
	}
	public void SetPwd(String pwd) {
		txtpwd.sendKeys(pwd);
	}
	public void clickLogin() {
		submitbtn.click();
		
		
		
	}
	
}
