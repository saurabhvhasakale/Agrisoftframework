package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class TaxMgmtPage extends TestBase{
	
	
	@FindBy(xpath="//input[@id='taxType']")
	WebElement TaxType;
	@FindBy(xpath="//input[@id='cgst']")
	WebElement Cgst;
	@FindBy(xpath="//input[@id='sgst']")
	WebElement Sgst;
	@FindBy(xpath="//input[@id='save']")
	WebElement SaveBtn;
	
	public TaxMgmtPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void addTaxDetails(String TT,String CG,String SG)
	{
		TaxType.sendKeys(TT);
		Cgst.sendKeys(CG);
		Sgst.sendKeys(SG);
		SaveBtn.click();
	}
}
