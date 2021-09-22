package com.crm.qa.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;

public class ContactsPageObjects extends Base{
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	public static WebElement contactslabel;
	
//	@FindBy(xpath="(//a[text()='David Cris']//parent::td[@class='datalistrow'])[1]//preceding-sibling::td[@class='datalistrow']//input[@type='checkbox']")
//	public static WebElement checkboxlabel;
	
	@FindBy(id="first_name")
    public static WebElement firstname;
	
	@FindBy(id="surname")
    public static WebElement lastname;
	
	@FindBy(name="client_lookup")
	public static WebElement company;
	
	@FindBy(xpath="//input[@value='Save' and @type='submit']")
	public static WebElement saveBtn;
	
	
}
