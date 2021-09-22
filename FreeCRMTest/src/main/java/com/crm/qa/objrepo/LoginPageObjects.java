package com.crm.qa.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;

public class LoginPageObjects extends Base
{
	
   @FindBy(name="username")
   public static WebElement username;
   
   @FindBy(name="password")
   public static WebElement password;
   
   @FindBy(xpath="//input[@type='submit']")
   public static WebElement loginBtn;
   
   @FindBy(xpath="//a[text()='Sign Up']")
   public static WebElement signup;

   @FindBy(xpath="//img[@class='img-responsive']")
   public static WebElement crmLogo;


}
