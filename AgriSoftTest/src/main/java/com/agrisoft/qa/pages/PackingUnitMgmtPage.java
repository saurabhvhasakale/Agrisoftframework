package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class PackingUnitMgmtPage extends TestBase {
	
	@FindBy(xpath="//input[@id='unitName']")
	WebElement SIunit;
	@FindBy(xpath="//input[@id='unitDescription']")
	WebElement SIunitDescription;
	@FindBy(xpath="//input[@id='save']")
	WebElement SaveBtn;
	
	public PackingUnitMgmtPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addPackingDetails(String SIUnit,String Description)
	{
		SIunit.sendKeys(SIUnit);
		SIunitDescription.sendKeys(Description);
		SaveBtn.click();
	}
	

}
