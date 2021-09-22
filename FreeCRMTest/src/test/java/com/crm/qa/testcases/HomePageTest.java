package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtilities;

public class HomePageTest extends Base{
	LoginPage loginpage;
	HomePage homepage;
	TestUtilities util;
	ContactsPage contactspage;
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		util=new TestUtilities();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String title=homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "CRMPRO","home page title is not correct");
	}
	
	@Test(priority=2)
	public void verifyUsernametest() {
		util.switchToFrame();
		Assert.assertTrue(homepage.verifycorrectusername());
	}
	
	
	@Test(priority=3)
	public void verifyContactslinkTest() {
		util.switchToFrame();
		contactspage  = homepage.clickOncontactsPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
