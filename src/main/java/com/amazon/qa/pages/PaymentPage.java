package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class PaymentPage extends TestBase {

	public PaymentPage() throws Exception {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Add Debit/Credit/ATM Card')]")
	WebElement selectCreditCard;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement AddcardNumber;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement AddCard;
	
	public boolean Addcard() throws InterruptedException
	{
		selectCreditCard.click();
		driver.findElement(By.linkText("Add a credit or debit card")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		AddcardNumber.sendKeys(obj.getProperty("creditCardNumber"));
		AddCard.click();
		Thread.sleep(2000);
		boolean validity=driver.findElements(By.xpath("//span[contains(text(),'Card number is not correct.')]")).size() >0;	
		
		return validity;
		
	
	}
	
	

}
