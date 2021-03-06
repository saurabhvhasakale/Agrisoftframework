package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.ExpenditurePage;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.SupplierPage;
import com.agrisoft.qa.utilities.TestUtil;

public class ExpenditureDetailsPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homePage;
	TestUtil util;
	ExpenditurePage expdtpage;
    String sheetName="Direct_Expt";
    String sheetName1="Indirect_Expt";

    public ExpenditureDetailsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		util=new TestUtil();
	    loginpage=new LoginPage();
	    homePage=new HomePage();
	    expdtpage=new ExpenditurePage();
	    homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"), driver);

	}
	 
	 @DataProvider
		public Object[][] getCRMTestData() throws IOException
	    {
			Object data[][] = TestUtil.getTestData(sheetName);

			return data;
		}
	 @DataProvider
	 public Object[][] getIndirectData() throws IOException
	 {
			Object data1[][] = TestUtil.getTestData(sheetName1);
			return data1;

	 }
	 @Test(priority = 1,dataProvider = "getCRMTestData")
	 public void validateExpendtDeatailsPageTest(String N)  
	 {
		 homePage.ClickOnMasterLink();
		 expdtpage= homePage.ClickOnExpdtLink();
		 expdtpage.AddExpdtDtails(N);
		 
			// TODO Auto-generated catch block
	 }
	 @Test(priority = 2,dataProvider ="getIndirectData" )
	 public void validateIndirectExpendtDetailsPageTest(String N)
	 {
		 homePage.ClickOnMasterLink();
		 expdtpage= homePage.ClickOnExpdtLink();
		 expdtpage.AddIndirectExpdtDetails(N);
	 }
		 
	 
	 @AfterMethod
	 public void TearDown()
	 {
		 driver.quit();
	 }
}


