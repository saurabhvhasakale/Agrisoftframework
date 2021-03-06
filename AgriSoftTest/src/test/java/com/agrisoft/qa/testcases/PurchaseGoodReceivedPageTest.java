package com.agrisoft.qa.testcases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.PurchaseGoodReceivedPage;
import com.agrisoft.qa.utilities.TestUtil;

public class PurchaseGoodReceivedPageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	TestUtil util;
    PurchaseGoodReceivedPage PGRP;
    String sheetName="Good_Recieved_ForFertilizer";

	
	public PurchaseGoodReceivedPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		util=new TestUtil();	
        loginPage=new LoginPage();
		homePage=new HomePage();
		PGRP=new PurchaseGoodReceivedPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"),driver);
	}
	 @DataProvider
		public Object[][] getCRMTestData() throws IOException
	    {
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	  
    @Test(dataProvider = "getCRMTestData")
	public void validatePurchaseGoodReceivedPage(String SN,String BN,String PN,String QT,String BNo)
	{
		homePage.ClickOnPurchaseLink();
		PGRP=homePage.ClickOnGoodReceivedlink(); 
		PGRP.Godown2();
		PGRP.selctcatFertilzer();
		PGRP.MakeGoodRecieve(SN, BN, PN,QT,BNo);
		
	}
	
	
	  @AfterMethod public void TearDown() { driver.quit(); }
	 
	 
}
