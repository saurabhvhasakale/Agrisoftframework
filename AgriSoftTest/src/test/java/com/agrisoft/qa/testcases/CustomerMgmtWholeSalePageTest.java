package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.CustomerMgmtRetailPage;
import com.agrisoft.qa.pages.CustomerMgmtWholesalePage;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.utilities.TestUtil;

public class CustomerMgmtWholeSalePageTest extends TestBase{
	
	CustomerMgmtWholesalePage CustmrWholeSalePage;
	CustomerMgmtRetailPage custmrmgmtPage;
	LoginPage loginpage;
	HomePage homePage;
	TestUtil util;
    String sheetName="Wholesale_customer_details";

	
	public CustomerMgmtWholeSalePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		util=new TestUtil();
	    custmrmgmtPage=new CustomerMgmtRetailPage();
	    loginpage=new LoginPage();
	    homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"), driver);

	}
	 
	 @DataProvider
		public Object[][] getCRMTestData() throws IOException{
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	@Test(dataProvider = "getCRMTestData")
	public void validateCustomerDetailsWholesalePageTest(String SNO,String ADDR,String CPO,String EID,String CNO,String ACNO,String GNO,String ANO,String ZCO)
	{

		homePage.ClickOnMasterLink();
		homePage.ClickonCustomerLink();
		CustmrWholeSalePage=homePage.ClickOnTab();
		CustmrWholeSalePage.AddNewWholeSaleCustomer(SNO, ADDR, CPO, EID, CNO, ACNO, GNO, ANO, ZCO);
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
