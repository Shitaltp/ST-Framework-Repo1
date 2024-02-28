package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;

public class LoginPage extends TestBase{

	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css= "div._3N4_BX a._1TOQfO")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[@class=\"IiD88i _351hSN\"]")
	private WebElement enterEmailOrMobileNum;
	
	public void clickOnLogin() {
		loginBtn.click();
		enterEmailOrMobileNum.sendKeys("9325553569");
	}
}
