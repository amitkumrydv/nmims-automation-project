package com.nmims.pageObjectMethod;

import org.openqa.selenium.WebDriver;

import com.nmims.pageObject.LoginPage;

public class LoginPageMethod extends LoginPage {

	public LoginPageMethod(WebDriver driver) {
		super(driver);
	}

	public void setUserName(String username) {
		userId.clear();
		userId.sendKeys(username);
	}

	public void setPassword(String password) {
		pswd.clear();
		pswd.sendKeys(password);
	}

	public void clickLogin() {
		login.click();
	}

	
	public void clickLogout() 
	{ logout.click(); 
	}
	 

}
