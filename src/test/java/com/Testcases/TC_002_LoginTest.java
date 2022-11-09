package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.MyAccountPage;
import com.testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	
	@Test
	public void loginTest() throws InterruptedException {
	logger.info(" ******* Starting TC_002_LoginTest *******");
		
		HomePage hp= new HomePage(driver);
		hp.clickLoginlnk();
		logger.info("clicked on Login");
		
		LoginPage lp=new LoginPage(driver);
		lp.SetEmail("email");      //The "email" and "password" is stored in config.properties in the resources 
		lp.SetPwd("password");
		lp.clickLogin();
		
		//To verify that we landed on the acct page after log in
		MyAccountPage acct=new MyAccountPage(driver);
		boolean targetpage=acct.isMyAccountPageExists();
		
		try {
			Assert.assertEquals(targetpage,true);
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	

}