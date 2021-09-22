package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;
import com.crm.qa.objrepo.LoginPageObjects;

public class LoginPage extends Base {
	
	
    public LoginPage() {
    	PageFactory.initElements(driver,LoginPageObjects.class);
    }

  //Actions :- 
  	public String validateLoginPageTitle() {
  		return driver.getTitle();
  	}
  	
  	public boolean validateCRMImage() {
  		return LoginPageObjects.crmLogo.isDisplayed();
  	}
  	
  	public HomePage login(String uname,String pswd) {
  		
  		LoginPageObjects.username.sendKeys(uname);
  		LoginPageObjects.password.sendKeys(pswd);
  		LoginPageObjects.loginBtn.click();
  		
  		return new HomePage();
  	}
}
