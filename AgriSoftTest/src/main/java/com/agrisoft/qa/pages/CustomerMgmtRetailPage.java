package com.agrisoft.qa.pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.utilities.TestUtil;

public class CustomerMgmtRetailPage extends TestBase {
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/h2")
	WebElement CustomerDetailsLable;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstName;
	@FindBy(xpath="//input[@id='middleName']")
	WebElement MiddleName;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement LastName;
	@FindBy(xpath="//input[@id='address']")
	WebElement Address;
	@FindBy(xpath="//input[@id='contactNo']")
	WebElement ContactNo;
	@FindBy(xpath="//input[@id='aadharNo']")
	WebElement AdharNo;
	@FindBy(xpath="//input[@id='emailId']")
	WebElement EmailId;
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement ZipCode;
	@FindBy(xpath="//input[@id='gstno']")
	WebElement GstNo;
	@FindBy(xpath="//input[@id='save']")
	WebElement SaveBtn;
	@FindBy(xpath="//input[@id='listBtn']")
	WebElement ListBtn;
	
	
	 
	public CustomerMgmtRetailPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyCustomerDetailsLable()
	{
		return CustomerDetailsLable.isDisplayed();
	}
	

    public void AddNewCustomer(String FN,String MN,String LN,String ADD,String CN,String AN,String EI,String ZC,String GST)
    {
		FirstName.sendKeys(FN);
		MiddleName.sendKeys(MN);
		LastName.sendKeys(LN);
		Address.sendKeys(ADD);
		ContactNo.sendKeys(CN);
		AdharNo.sendKeys(AN);
		EmailId.sendKeys(EI);
		ZipCode.sendKeys(ZC);
		GstNo.sendKeys(GST);
		SaveBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		

		
		
		}

}
