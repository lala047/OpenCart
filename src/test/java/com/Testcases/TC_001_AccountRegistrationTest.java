package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.pageobjects.AccountRegistrationPage;
import com.pageobjects.HomePage;
import com.testBase.BaseClass;

import wdcmds.ActionDriver;

public class TC_001_AccountRegistrationTest extends BaseClass{

	@Test
	public void test_account_registration() throws InterruptedException{  // notice me
		
		logger.info(" ******* Starting TC_001_AccountRegistrationTest *******");
		
		HomePage hp= new HomePage(driver);
		hp.clickRegisterlnk();
		logger.info("clicked on Register");

		AccountRegistrationPage apg=new AccountRegistrationPage(driver) ;
		//apg.setFirstName("emmas");
		apg.setFirstName(randomeString().toUpperCase()); // This will generate random  first name
		logger.info("Provided first name");
		//apg.setLastName("emmas");
		apg.setLastName(randomeString().toUpperCase()); // This will generate random last name
		logger.info("Provided last name");
	//	apg.setEmail("emmaighedo@yahoo.com");
		apg.setEmail(randomeString() + "@gmail.com");// randomly generated the email
		logger.info("Provided last name");
		apg.setPassword("slyman01");
		logger.info("Provided password");

		WebElement chckpolicy= driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement  btnContinue= driver.findElement(By.xpath("//button[normalize-space()='Continue']"));

	 ActionDriver.clickElementByJS(chckpolicy, driver);
	 ActionDriver.clickElementByJS(btnContinue, driver);
	 Thread.sleep(3000);

}
		
}