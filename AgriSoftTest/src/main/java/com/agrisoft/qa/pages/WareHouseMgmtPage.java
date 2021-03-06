package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class WareHouseMgmtPage extends TestBase{
	
	@FindBy(xpath="//input[@id='godownName']")
	WebElement GodownName;
	@FindBy(xpath="//input[@id='btn']")
	WebElement SaveBtn;
	
	public WareHouseMgmtPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddWareHouse(String Name)
	{
		GodownName.sendKeys(Name);
		SaveBtn.click();
	}
	

}
