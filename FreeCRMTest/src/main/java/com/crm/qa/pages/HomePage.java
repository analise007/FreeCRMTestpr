package com.crm.qa.pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;
import com.crm.qa.objrepo.HomePageObjects;

public class HomePage extends Base {
	
	
	public HomePage() {
		PageFactory.initElements(driver, HomePageObjects.class);
	}
	
	//Actions:
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean verifycorrectusername() {
		
		return HomePageObjects.usernameLabel.isDisplayed();
	}
	
	public ContactsPage clickOncontactsPage() {
		
		HomePageObjects.contactslink.click();
		return new ContactsPage();	
	}
	
	public DealsPage clickOndealsPage() {
		HomePageObjects.dealslink.click();
		return new DealsPage();	
	

}
	public TasksPage clickOntaskssPage() {
		HomePageObjects.taskslink.click();
		return new TasksPage();	
	
	
}
	public void clickOnNewContactLink() {
		Actions actions=new Actions(driver);
		actions.moveToElement(HomePageObjects.contactslink).build().perform();
		HomePageObjects.newcontactlink.click();
		}
}