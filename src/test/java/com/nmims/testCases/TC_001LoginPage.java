package com.nmims.testCases;


import org.testng.annotations.Test;

import com.nmims.baseClass.BaseClass;
import com.nmims.pageObjectMethod.LoginPageMethod;



public class TC_001LoginPage  extends BaseClass{

	

@Test(priority = 1)
public void loginTest() throws InterruptedException {
	
	
	LoginPageMethod loginpage=new LoginPageMethod(driver);
	
	loginpage.setUserName(userName);
	
	loginpage.setPassword(password);
	
	loginpage.clickLogin();
	
	Thread.sleep(5000);
	
	 loginpage.clickLogout(); 
	
	
}
}
