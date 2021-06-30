package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws Exception {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbar;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Search;
	@FindBy(xpath="//span[contains(text(),'New Apple iPhone 12 Mini (128GB) - Black')]")
	WebElement iphone;
	
	public String homePagetitle()
	{
		return driver.getTitle();
	}
	public void searchItem()
	{
		Searchbar.sendKeys("iphone11phone 128gb");
		Search.click();		
	}
	public void selectItem()
	{
		iphone.click();
	}
}
