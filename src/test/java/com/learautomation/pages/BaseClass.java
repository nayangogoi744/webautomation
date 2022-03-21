package com.learautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learautomation.utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver= BrowserFactory.startApp(driver, "firefox","https://ui.freecrm.com/");
	}
	
	@AfterClass
	public void close() {
		BrowserFactory.quitBrowser(driver);
	}
}
