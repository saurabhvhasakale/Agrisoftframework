package com.agrisoft.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.utilities.TestUtil;

public class LoginPage extends TestBase{
	
	//Page Factory or Object Repository
	
	@FindBy(name="uname")
	WebElement username;
	@FindBy(name="pass")
	WebElement password;
	@FindBy(id="shopname")
	WebElement shopName;
	@FindBy(xpath="//button[@class='btn']")
	WebElement LoginButton;
	@FindBy(xpath="//h1[contains(text(),'AgriSoft')]")
	WebElement Logo;
	
	//Initializing the page objects:
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions:
	public String validateLoginPageTitle()
	{
		
		return driver.getTitle();
	}
	public boolean validateAgrisofImage()
	{
		return Logo.isDisplayed();
	}
	public HomePage login(String Un,String pwd,WebDriver driver)
	{
		
		username.sendKeys(Un);
		password.sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        shopName.sendKeys("1,1,embel");
        LoginButton.click();
        return new HomePage();
        
        
		
	}
}
