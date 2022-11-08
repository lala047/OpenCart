package com.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
		
	}
	
		
		@FindBy(xpath = "//input[@id='input-firstname']") public WebElement txtFirstname;

		@FindBy(xpath = "//input[@id='input-lastname']") public WebElement txtLasttname;

		@FindBy(xpath = "//input[@id='input-email']")    public WebElement txtEmail;

		@FindBy(xpath = "//input[@id='input-password']") public WebElement txtPassword;

		@FindBy(xpath = "//input[@name='agree']")  public WebElement chckpolicy;

		@FindBy(xpath = "//button[normalize-space()='Continue']") public WebElement btnContinue;

		@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") public WebElement msgConfirmation;

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);
			
		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);


		}

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		

		}

		public void setPrivacyPolicy(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  // public static void clickElementByJS(WebElement element, WebDriver driver) {
        js.executeScript("arguments[0].click();", element);
        setPrivacyPolicy(chckpolicy, driver);
		    }
		

		public void clickContinue() {
			btnContinue.click();
		
		}

		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
		}

	


