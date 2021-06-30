package com.amazon.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	public LoginPageTest() throws Exception {
		super();
	}
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();	
	}
	
	@Test
	public void loginTest()
	{
		loginpage.login();
		
	}
	@Test
	public void LoginpageTitleTest()
	{
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String Title= loginpage.loginPageTitle();
		Assert.assertEquals(Title, expectedTitle);
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
