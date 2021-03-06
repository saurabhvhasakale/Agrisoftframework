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
import com.agrisoft.qa.pages.WareHouseMgmtPage;
import com.agrisoft.qa.utilities.TestUtil;

public class WareHouseMgmtPageTest extends TestBase{
	
	LoginPage LoginPage;
	HomePage homePage;
	WareHouseMgmtPage WareHouse;
	String sheetName="Godown";
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		LoginPage=new LoginPage();
		homePage=new HomePage();
		WareHouse=new WareHouseMgmtPage();
		homePage=LoginPage.login(prop.getProperty("username"), prop.getProperty("password"),driver);
		
		
	}
	@DataProvider
	public Object[][] getWareHouseData() throws IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider = "getWareHouseData")
	public void validateWareHouseMgmtPageTest(String N)
	{
		homePage.ClickOnMasterLink();
		WareHouse=homePage.ClickOnWareHouseLink();
		WareHouse.AddWareHouse(N);
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
