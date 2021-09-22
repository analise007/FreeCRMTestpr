package com.crm.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.Base;
import com.crm.qa.objrepo.ContactsPageObjects;

public class ContactsPage extends Base {
	
	public ContactsPage() {
		PageFactory.initElements(driver,ContactsPageObjects.class);
	}
	
	
     public boolean verifyContactsLabel() {
    	 return ContactsPageObjects.contactslabel.isDisplayed();
     }
     
     
     public void selectsContactsByName(String name) {
    	 driver.findElement(By.xpath("(//a[text()='"+name+"']//parent::td[@class='datalistrow'])[1]//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
     }
     
     public void createNewContact(String title,String firstName,String lastName,String comp)
     {
    	 Select s=new Select(driver.findElement(By.name("title")));
    	 s.selectByVisibleText(title);
    	 
    	 ContactsPageObjects.firstname.sendKeys(firstName);
    	 ContactsPageObjects.lastname.sendKeys(lastName);
    	 ContactsPageObjects.company.sendKeys(comp);
    	 ContactsPageObjects.saveBtn.click();
     }
}
