package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class CustomerMgmtWholesalePage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='shopname']")
	WebElement ShopName;
	@FindBy(xpath="//input[@id='custaddress']")
	WebElement Address;
	@FindBy(xpath="//input[@id='contactPerson']")
	WebElement ContactPerson;
	@FindBy(xpath="//input[@id='emailid']")
	WebElement EmailId;
	@FindBy(xpath="//input[@id='mobilenum']")
	WebElement ContactNo;
	@FindBy(xpath="//input[@id='AltcontactNo']")
	WebElement AltContactNo;
	@FindBy(xpath="//input[@id='gstnum']")
	WebElement GstNo;
	@FindBy(xpath="//input[@id='aadharnum']")
	WebElement AdharNo;
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement ZipCode;
	@FindBy(xpath="//input[@id='save1']")
	WebElement SubmitButton;
	
	public CustomerMgmtWholesalePage()
	{
		PageFactory.initElements(driver, this);
	}
    
	public void AddNewWholeSaleCustomer(String SN,String ADD,String CP,String EI,String CN,String ACN,String GN,String AN,String ZC)
	{
		ShopName.sendKeys(SN);
		Address.sendKeys(ADD);
		ContactPerson.sendKeys(CP);
		EmailId.sendKeys(EI);
		ContactNo.sendKeys(CN);
		AltContactNo.sendKeys(ACN);
		GstNo.sendKeys(GN);
		AdharNo.sendKeys(AN);
		ZipCode.sendKeys(ZC);
		SubmitButton.click();
	}

	

}
