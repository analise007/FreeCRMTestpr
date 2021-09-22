package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.objrepo.LoginPageObjects;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtilities;

public class LoginPageTest extends Base
{
	
	LoginPage loginpage;
	HomePage homepage;
	LoginPageObjects lpo;
	TestUtilities util;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		util=new TestUtilities();
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support."," titletest passed");
	}
	
	@Test(priority=-1)
	public void crmLogoImageTest() {
		boolean flag=loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	
	}
	
	@Test(priority=1)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
