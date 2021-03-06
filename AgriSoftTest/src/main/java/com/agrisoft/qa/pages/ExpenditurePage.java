package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class ExpenditurePage extends TestBase{
	
	@FindBy(xpath="//input[@id='expenseName']")
	WebElement ExpdtName;
	@FindBy(xpath="//input[@id='save']")
	WebElement SaveBtn;
	@FindBy(xpath="//input[@id='rd2']")
	WebElement IndirectButton;
	
	public ExpenditurePage()
	{
		PageFactory.initElements(driver, this);
	}

	public void AddExpdtDtails(String Name)
	{
		ExpdtName.sendKeys(Name);
		SaveBtn.click();
	}
	public void AddIndirectExpdtDetails(String Name)
	{
		IndirectButton.click();
		ExpdtName.sendKeys(Name);
		SaveBtn.click();

		
	}
}
