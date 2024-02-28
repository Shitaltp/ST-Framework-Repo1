package com.flipkart.testcases;

import org.testng.annotations.Test;


import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;

public class LoginPageTest extends TestBase {
  
	LoginPage loginPage;
	public LoginPageTest() {
		super();
	}
	@Test
	public  void toVerifyLoginCredentils() {
		loginPage = new LoginPage();
		loginPage.clickOnLogin();
	}
	
}
