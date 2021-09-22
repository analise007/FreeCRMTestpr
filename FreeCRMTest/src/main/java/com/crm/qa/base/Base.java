package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtilities;
import com.crm.qa.util.WebEventListener;

public class Base
{public static WebDriver driver;
public static Properties prop;
public static WebEventListener eventListener;
public  static EventFiringWebDriver e_driver;

public Base(){
	
	try {
		prop =new Properties();
		FileInputStream ip= new FileInputStream("D:\\Education\\Automationproj\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}


}

public static void initialization() {
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\Education\\Automationproj\\chromedriver.exe");
	    driver=new ChromeDriver();
	}else if(browserName.equals("FF")) {
		System.setProperty("webdriver.gecko.driver","D:\\Education\\Automationproj\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtilities.Page_Load_timeout,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtilities.implicit_wait,TimeUnit.SECONDS);
	
	
	driver.get(prop.getProperty("url"));
}


}


