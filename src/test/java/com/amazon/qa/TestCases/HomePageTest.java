package com.amazon.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.utillity.TestUtility;


import junit.framework.Assert;

public class HomePageTest extends TestBase {

	public HomePageTest() throws Exception {
		super();
	}
	HomePage homepage;
	LoginPage loginpage ;
	TestUtility util;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		loginpage.login();
		util=new TestUtility();
		
	}
	//@Test
	public void homePageTitleCheck()
	{
		String actualTitle=homepage.homePagetitle();
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void selectItem()
	{
		homepage.searchItem();
		util.navigateToNextTab();
		homepage.selectItem();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
