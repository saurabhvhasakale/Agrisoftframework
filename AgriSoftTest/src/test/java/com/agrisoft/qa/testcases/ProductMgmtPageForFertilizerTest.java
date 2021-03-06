package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.ProductMgmtPageForFertilizer;
import com.agrisoft.qa.utilities.TestUtil;

public class ProductMgmtPageForFertilizerTest extends TestBase {
	
	LoginPage Login;
	HomePage homePage;
	ProductMgmtPageForFertilizer pmfPage;
	String sheetName="Products_Details_Fertilizer";
	String sheetName1="Products_Details_Seed";
	String sheetName2="Products_Details_Pesticide";

	
	public ProductMgmtPageForFertilizerTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		Login=new LoginPage();
		homePage=new HomePage();
		pmfPage=new ProductMgmtPageForFertilizer();
		homePage=Login.login(prop.getProperty("username"), prop.getProperty("password"), driver);

	}
	@DataProvider
	public Object[][] getProductDataForFertilizer() throws IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@DataProvider
	public Object[][] getProductDataForSeed() throws IOException
	{
		Object data1[][]=TestUtil.getTestData(sheetName1);
		return data1;
	}
	@DataProvider
	public Object[][] getProductDataForPesticide() throws IOException
	{
		Object data3[][]=TestUtil.getTestData(sheetName2);
		return data3;
	}
	
	@Test(priority = 1,dataProvider = "getProductDataForFertilizer")
	public void validateProductMgmtPageForFertilizer(String PN,String CN,String PCG,String Ut,String Value,String MRP,String BP,String SP,String HSN)
	{
		homePage.ClickOnMasterLink();
		pmfPage=homePage.ClickOnProductDetails();
		pmfPage.SelectFertilizercat();
		pmfPage.AddDetails(PN, CN, PCG, Ut, Value, MRP, BP, SP, HSN);
		
		
	}
	@Test(priority = 2,dataProvider = "getProductDataForSeed")
	public void validateProductMgmtPageForSeed(String PN,String CN,String PCG,String Ut,String Value,String MRP,String BP,String SP,String HSN)
	{
		homePage.ClickOnMasterLink();
		pmfPage=homePage.ClickOnProductDetails();
		pmfPage.SelectSeedCat();
		pmfPage.AddDetails(PN, CN, PCG, Ut, Value, MRP, BP, SP, HSN);
		
		
	}
	@Test(priority = 3,dataProvider = "getProductDataForPesticide")
	public void validateProductMgmtPageForPesticide(String PN,String CN,String PCG,String Ut,String Value,String MRP,String BP,String SP,String HSN)
	{
		homePage.ClickOnMasterLink();
		pmfPage=homePage.ClickOnProductDetails();
		pmfPage.SelectPesticideCat();
		pmfPage.AddDetails(PN, CN, PCG, Ut, Value, MRP, BP, SP, HSN);
		
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
    
	
