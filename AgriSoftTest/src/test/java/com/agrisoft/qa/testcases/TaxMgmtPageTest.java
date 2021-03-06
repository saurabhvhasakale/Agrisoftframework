package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.TaxMgmtPage;
import com.agrisoft.qa.utilities.TestUtil;

public class TaxMgmtPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homePage;
	TaxMgmtPage taxmgmtPage;
	TestUtil util;
    String sheetName="Tax_Details";
    
    public TaxMgmtPageTest()
    {
    	super();
    }
    @BeforeMethod
    public void setup()
    {
    	initialization();
    	loginpage=new LoginPage();
    	homePage=new HomePage();
    	taxmgmtPage=new TaxMgmtPage();
    	homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"), driver);
    	
    }
    @DataProvider
    public Object[][] getTaxMgmtData() throws IOException
    {
    	Object data[][]=TestUtil.getTestData(sheetName);
    	return data;
    }
    @Test(dataProvider = "getTaxMgmtData")
    public void validateTaxDetailsPageTest(String Ttype,String CGST ,String SGST)
    {
    	homePage.ClickOnMasterLink();
    	taxmgmtPage=homePage.ClickOnTaxMgmtLink();
    	taxmgmtPage.addTaxDetails(Ttype, CGST, SGST);
    }
    @AfterMethod
    public void TearDown()
    {
    	driver.quit();
    }

}
