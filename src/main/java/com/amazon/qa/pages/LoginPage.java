package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws Exception {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement signInBtn;
	
	@FindBy(name="email")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(id="ap_password")
	WebElement pswd;
	
	@FindBy(id="signInSubmit")
	WebElement SignIn;
	
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	public void login()
	{
		signInBtn.click();
		emailid.sendKeys(obj.getProperty("phno"));
		continueBtn.click();
		pswd.sendKeys(obj.getProperty("password"));
		SignIn.click();
		
		
	}

}
