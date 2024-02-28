package com.flipkart.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		toVerifyUserIsableToLogin();
	}
	
	public static void toVerifyUserIsableToLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
