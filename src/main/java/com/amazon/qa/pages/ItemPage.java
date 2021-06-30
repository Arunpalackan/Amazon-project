package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ItemPage extends TestBase{

	public ItemPage() throws Exception {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath="//input[@id='buy-now-button']")
	 WebElement Buynow;
	 
	public String GetItemPageTitle() {
		return driver.getTitle();
		}
	
	public void buyNow()
	{
		/*Actions actions = new Actions(driver);
		actions.moveToElement(Buynow);
		actions.build().perform();*/
		Buynow.click();
	}

}
