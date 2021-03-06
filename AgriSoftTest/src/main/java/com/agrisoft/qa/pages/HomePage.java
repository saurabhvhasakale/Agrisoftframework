package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agrisoft.qa.base.TestBase;

public class HomePage extends TestBase {
	
 @FindBy(xpath="/html/body/nav/ul/li[11]/label[2]")
 WebElement shopNameLable;
 @FindBy (xpath="//a[contains(text(),'Master') or @class='fa fa-address-book-o']")
 WebElement MasterLink;
 @FindBy(xpath="//a[@href='customer_detail.jsp'  or contains(text(),' Customer Management')]")
 WebElement CustomerDetailsLink;
 @FindBy(xpath="//span[text()='WholeSale']")
 WebElement WholeSaleTab;
 @FindBy(xpath="//a[@href='supplierdetails' or contains(text(),' Supplier Management ')]")
 WebElement SupplierDetailsLink;
 @FindBy(xpath="//a[@href='expenditureDetails.jsp']")
 WebElement ExptDetailsLink;
 @FindBy(xpath="//a[@href='tax.jsp']")
 WebElement TaxmgmtLink;
 @FindBy(xpath="//a[@href='measuringUnits.jsp']")
 WebElement PackingUnitLink;
 @FindBy(xpath="//a[@href='godownDetails.jsp']")
 WebElement WareHouseLink;
 @FindBy(xpath="//a[text()=' Product Management  ']")
 WebElement ProductMgmtLink;
 @FindBy(xpath="//a[@href='addCategoryDetails.jsp']")
 WebElement CategoryLink;
 @FindBy(xpath="//a[@href='product_detail.jsp']")
 WebElement AddProductLink;
 @FindBy(xpath="//a[text()=' Purchase ']")
 WebElement PurchaseLink;
 @FindBy(xpath="//a[text()=' Advance Booking ']")
 WebElement AdvanceBookingLink;
 @FindBy(xpath="//a[@href='proforma.jsp']")
 WebElement ProformaLink;
 @FindBy(xpath="//a[@href='goodsReceive.jsp']")
 WebElement GoodRecievedLink;
 
 
 public HomePage()
   {
		PageFactory.initElements(driver, this);
   }	
 
 public String verifyHomePageTitle()
   {
	    return driver.getTitle();
   }

 public boolean VerifyCorrectShopName()
   {
	    return shopNameLable.isDisplayed();
   }
 
 public void ClickOnMasterLink()
   {
	    MasterLink.click();
   }
 public void ClickOnPurchaseLink()
  {
	 PurchaseLink.click();
  }
 
 public CustomerMgmtRetailPage ClickonCustomerLink()
   {
	    Actions action=new Actions(driver);
	    action.moveToElement(CustomerDetailsLink).build().perform();
	    CustomerDetailsLink.click();
	    return new CustomerMgmtRetailPage();
	 
   }
 
 public  CustomerMgmtWholesalePage ClickOnTab()
   {
	    WholeSaleTab.click();
	    return new CustomerMgmtWholesalePage();
   }
 
 public SupplierPage ClickOnSupplierDetails()
	
   {
		Actions action=new Actions(driver);
		action.moveToElement(SupplierDetailsLink).build().perform();
		SupplierDetailsLink.click();
		return new SupplierPage();
   }
 
 public ExpenditurePage ClickOnExpdtLink()
   {
	    Actions action=new Actions(driver);
		action.moveToElement(ExptDetailsLink).build().perform();
		ExptDetailsLink.click();
		return new ExpenditurePage();
   }
 
 public TaxMgmtPage ClickOnTaxMgmtLink()
  {
	    
	    Actions action=new Actions(driver);
		action.moveToElement(TaxmgmtLink).build().perform();
		TaxmgmtLink.click();
		return new TaxMgmtPage();
	 
  }
 public PackingUnitMgmtPage ClickOnPackingLink()
 {
	    Actions action=new Actions(driver);
		action.moveToElement(PackingUnitLink).build().perform();
		PackingUnitLink.click();
		return new PackingUnitMgmtPage();
	 
 }
 public WareHouseMgmtPage ClickOnWareHouseLink()
 {
	    Actions action=new Actions(driver);
		action.moveToElement(WareHouseLink).build().perform();
		WareHouseLink.click();
		return new WareHouseMgmtPage();
	 
 }
 public CategoryMgmtPage ClickOnProductCategoryLink()
 {
	    Actions action=new Actions(driver);
		action.moveToElement(ProductMgmtLink).build().perform();
		action.moveToElement(CategoryLink).build().perform();
		CategoryLink.click();
		return new CategoryMgmtPage();	 
 }
 
 public ProductMgmtPageForFertilizer ClickOnProductDetails()
 {
	    Actions action=new Actions(driver);
		action.moveToElement(ProductMgmtLink).build().perform();
		action.moveToElement(AddProductLink).build().perform();
		AddProductLink.click();
		return new ProductMgmtPageForFertilizer();
		
 }
 public PurchaseProformaPage ClickOnPurchaseProformaLink()
 {
	 Actions action=new Actions(driver);
	 action.moveToElement(AdvanceBookingLink).build().perform();
	 action.moveToElement(ProformaLink).build().perform();
	 ProformaLink.click();
	 return new PurchaseProformaPage();
 }
 public PurchaseGoodReceivedPage ClickOnGoodReceivedlink()
 {
	 Actions action=new Actions(driver);
	 action.moveToElement(GoodRecievedLink).build().perform();
	 GoodRecievedLink.click();
	 return new PurchaseGoodReceivedPage();
	 
 }
 
 

}
