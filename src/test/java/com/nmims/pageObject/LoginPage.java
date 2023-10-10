package com.nmims.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username")
	//@CacheLookup
	public WebElement userId;
	
	@FindBy(name="password")
	@CacheLookup
	 public WebElement pswd;
	
	@FindBy(xpath="//button[.='Login']")
	@CacheLookup
	public  WebElement login;
	
	@FindBy(xpath = "//a[.='Logout']") 
	 @CacheLookup 
	 public WebElement logout;
	 
}
