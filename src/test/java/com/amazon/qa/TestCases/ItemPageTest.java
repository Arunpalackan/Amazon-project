package com.amazon.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.ItemPage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.utillity.TestUtility;

public class ItemPageTest extends TestBase {

	public ItemPageTest() throws Exception {
		super();
	}
	LoginPage loginpage;
	HomePage homepage;
	TestUtility util;
	ItemPage itempage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();	
		homepage=new HomePage();
		itempage=new ItemPage();
		loginpage.login();
		util=new TestUtility();
		homepage.searchItem();
		homepage.selectItem();
		util.navigateToNextTab();
		
	}
	
	@Test
	public void loginTest()
	{
		itempage.buyNow();
		
	}
	@Test
	public void ItemPageTitleTest()
	{
		String expectedTitle="New Apple iPhone 12 Mini (128GB) - Black : Amazon.in: Electronics";
		String Title= itempage.GetItemPageTitle();
		Assert.assertEquals(Title, expectedTitle);
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}