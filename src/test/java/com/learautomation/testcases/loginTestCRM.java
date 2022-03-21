package com.learautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learautomation.pages.BaseClass;
import com.learautomation.pages.loginPage;

public class loginTestCRM extends BaseClass {

	@Test
	public void loginApp() {
		
		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		loginpage.loginToCRM("nayangogoi744@gmail.com", "Welcome@1234");
		
	}
	
	
	

}
