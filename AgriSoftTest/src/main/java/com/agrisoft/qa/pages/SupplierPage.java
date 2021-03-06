package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class SupplierPage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='dealerName']")
	WebElement SupplierName;
	@FindBy(xpath="//input[@id='personName']")
	WebElement PersonName;
	@FindBy(xpath="//input[@id='contactNo']")
	WebElement ContactNo;
	@FindBy(xpath="//input[@id='landline']")
	WebElement LandlineNo;
	@FindBy(xpath="//input[@id='emailId']")
	WebElement EmailId;
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	@FindBy(xpath="//input[@id='tinNo']")
	WebElement GstNo;
	@FindBy(xpath="//input[@id='address']")
	WebElement Address;
	@FindBy(xpath="//input[@id='btn1']")
	WebElement SubmitBtn;
	
	public SupplierPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddSupplierDetails(String SN,String PN,String CN,String LN,String EI,String CT,String GST,String ADD)
	{
		
		
		SupplierName.sendKeys(SN);
		PersonName.sendKeys(PN);
		ContactNo.sendKeys(CN);
		LandlineNo.sendKeys(LN);
		EmailId.sendKeys(EI);
		City.sendKeys(CT);
		GstNo.sendKeys(GST);
		Address.sendKeys(ADD);
		SubmitBtn.click();
		
	}

}
