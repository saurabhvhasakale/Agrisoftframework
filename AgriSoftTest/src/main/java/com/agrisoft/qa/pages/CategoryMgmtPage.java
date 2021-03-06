package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class CategoryMgmtPage extends TestBase {
	
	@FindBy(xpath="//input[@id='category']")
	WebElement CategoryName;
	
	@FindBy(xpath="//input[@id='btn']")
	WebElement SubmitBtn;
	
	public CategoryMgmtPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void AddCategory(String CN)
	{
		CategoryName.sendKeys(CN);
		SubmitBtn.click();
	}
	

}
