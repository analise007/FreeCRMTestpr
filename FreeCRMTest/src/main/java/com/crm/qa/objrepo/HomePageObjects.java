package com.crm.qa.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;

public class HomePageObjects extends Base{
	
	@FindBy(xpath="//td[contains(text(),'User: Gayatri das')]")
	public static WebElement usernameLabel;
	
	@FindBy(xpath="//a[text()='Contacts']")
	public static WebElement contactslink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	public static WebElement newcontactlink;
	
	
	@FindBy(xpath="//a[text()='Deals']")
	public static WebElement dealslink;
	
	@FindBy(xpath="//a[text()='Tasks']")
	public static WebElement taskslink;
	

}
