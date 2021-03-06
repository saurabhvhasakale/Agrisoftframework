package com.agrisoft.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.agrisoft.qa.base.TestBase;
import com.agrisoft.qa.pages.HomePage;
import com.agrisoft.qa.pages.LoginPage;
import com.agrisoft.qa.pages.SupplierPage;
import com.agrisoft.qa.utilities.TestUtil;

public class SupplierDetailsTest extends TestBase{
	

	LoginPage loginpage;
	HomePage homePage;
	SupplierPage suppage;
	TestUtil util;
    String sheetName="Supplier_details";

    public SupplierDetailsTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		util=new TestUtil();
	    loginpage=new LoginPage();
	    suppage=new SupplierPage();
	    homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"), driver);

	}
	  
	    @DataProvider
		public Object[][] getCRMTestData() throws IOException
	    {
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	
	 @Test(dataProvider ="getCRMTestData" )
	 public void validateSupplierDeatailsPageTest(String SNO,String PNO,String CNO,String LNO,String EID,String CTY,String GSTNO,String ADDS) throws Exception
	 {
		 homePage.ClickOnMasterLink();
		 suppage=homePage.ClickOnSupplierDetails();
		 suppage.AddSupplierDetails(SNO, PNO, CNO, LNO, EID, CTY, GSTNO, ADDS);
		 // TODO Auto-generated catch block
		}
		 
	 
	 @AfterMethod
	 public void TearDown()
	 {
		 driver.quit();
	 }
}
