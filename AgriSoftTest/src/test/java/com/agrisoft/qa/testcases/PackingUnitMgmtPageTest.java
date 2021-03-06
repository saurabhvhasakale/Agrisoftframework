package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.PackingUnitMgmtPage;
import com.agrisoft.qa.utilities.TestUtil;

public class PackingUnitMgmtPageTest extends TestBase{
	
	LoginPage LoginPage;
	HomePage homePage;
	PackingUnitMgmtPage packingMgmtPage;
	String sheetName="Measuring_Units";

	
	@BeforeMethod
	public void setup()
	{
		initialization();
		LoginPage=new LoginPage();
		homePage=new HomePage();
		packingMgmtPage=new PackingUnitMgmtPage();
		homePage=LoginPage.login(prop.getProperty("username"), prop.getProperty("password"),driver);
		
		
	}
	
	@DataProvider
	public Object[][] getPackingData() throws IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider = "getPackingData")
	public void validatePackingMgmtPageTest(String SI,String Desc)
	{
		homePage.ClickOnMasterLink();
		packingMgmtPage=homePage.ClickOnPackingLink();
		packingMgmtPage.addPackingDetails(SI, Desc);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
