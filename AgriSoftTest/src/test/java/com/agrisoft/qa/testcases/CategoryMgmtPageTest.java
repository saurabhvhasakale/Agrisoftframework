package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.CategoryMgmtPage;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.utilities.TestUtil;

public class CategoryMgmtPageTest extends TestBase{
	
	LoginPage Login;
	HomePage homePage;
	CategoryMgmtPage ctmgmtPage;
	String sheetName="Category";
	
	public CategoryMgmtPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		Login=new LoginPage();
		homePage=new HomePage();
		ctmgmtPage=new CategoryMgmtPage();
		homePage=Login.login(prop.getProperty("username"), prop.getProperty("password"), driver);
	}
	@DataProvider
	public Object[][] getCategoryData() throws IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider = "getCategoryData")
	public void validateCategoryMgmtPageTest(String CtNm)
	{
		homePage.ClickOnMasterLink();
		ctmgmtPage=homePage.ClickOnProductCategoryLink();
		ctmgmtPage.AddCategory(CtNm);
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
