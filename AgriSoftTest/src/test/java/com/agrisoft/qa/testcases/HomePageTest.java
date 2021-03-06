package com.agrisoft.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"), driver);
		
	}
	@Test(priority = 1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Embel Technologies Pvt Ltd","Home Page title is not matched");
	}
	@Test(priority = 2)
	public void verifyShopNameTest()
	{
		Assert.assertTrue(homePage.VerifyCorrectShopName());

	} 

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
