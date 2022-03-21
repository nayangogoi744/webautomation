package com.learautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]") WebElement loginBtn;
	
	public void loginToCRM(String usernameApp, String passwordApp) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(usernameApp);
		password.sendKeys(passwordApp);
		loginBtn.click();
	}
}
