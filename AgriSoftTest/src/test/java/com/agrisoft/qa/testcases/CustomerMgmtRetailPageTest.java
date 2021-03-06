package com.agrisoft.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.CustomerMgmtRetailPage;
import com.agrisoft.qa.utilities.TestUtil;

public class CustomerMgmtRetailPageTest extends TestBase{
	
	CustomerMgmtRetailPage custmrmgmtPage;
	LoginPage loginpage;
	HomePage homePage;
	TestUtil util;
    String sheetName="customer_details";

	
	public CustomerMgmtRetailPageTest()
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

	
	 @AfterMethod 
	 public void tearDown()
	 { 
		 driver.quit(); 
	 }
	 
		/*
		 * @Test(priority = 1) public void verifyCustomerDeatailsLableTest() {
		 * Assert.assertTrue(custmrmgmtPage.verifyCustomerDetailsLable()); }
		 */
	 @DataProvider
		public Object[][] getCRMTestData() throws IOException{
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	@Test(dataProvider ="getCRMTestData")
	public void validateCustomerDetailsPageTest(String FName,String MName,String LName,String ADDR,String CNO,String ANO,String EID,String ZCO,String GSN) throws Exception
	{
		homePage.ClickOnMasterLink();
		custmrmgmtPage=homePage.ClickonCustomerLink();
        Thread.sleep(2000);		//custmrmgmtPage.AddNewCustomer("anuj","m","vhasakale","belamb","9876545678","555555555555", "saurabh@gmail.com","777777","HGFDS4567890");
		custmrmgmtPage.AddNewCustomer(FName, MName, LName,ADDR,CNO,ANO,EID,ZCO,GSN);
	}
	
	
	

}
