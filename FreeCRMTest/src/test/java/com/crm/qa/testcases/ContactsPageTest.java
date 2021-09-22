package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.util.TestUtilities;



public class ContactsPageTest extends Base{
	
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtilities util;
	ContactsPage contactspage;
	
	String sheetName = "contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
			util=new TestUtilities();
			initialization();
			loginpage=new LoginPage();
			homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
			util.switchToFrame();
			homepage.clickOncontactsPage();
			contactspage=new ContactsPage();
			contactspage=homepage.clickOncontactsPage();
	}
	
	@Test(priority=1)
     public void verifyContactsPageLabel() {
		Assert.assertTrue(contactspage.verifyContactsLabel(),"contacts label is missing");
	}
	
	@Test(priority=2)
	public void selectContactsTest() {
		contactspage.selectsContactsByName("David Cris");
		
	}
	
	@Test(priority=3)
	public void multipleContactsclicktest() {
		contactspage.selectsContactsByName("eee ffff");
		contactspage.selectsContactsByName("ccc ddd");
	}
	
//	@DataProvider
//	public Object[][] getCRMTestData() {
//		Object data[][] = TestUtilities.getTestData(sheetName);
//		return data;
//		
//}
//	
//	@Test
//	public void validateCreateNewContact(String title,String ftName,String ltName,String comp) {
//		homepage.clickOnNewContactLink();
//		contactspage.createNewContact("Mr.","Rachel", "Abraham","IBM");
//		//contactspage.createNewContact(title, ftName, ltName, comp);
//	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
