package com.agrisoft.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.agrisoft.qa.base.TestBase;

public class ProductMgmtPageForFertilizer extends TestBase {
	
	
	@FindBy(xpath="//input[@id='fk_cat_id']")
	WebElement SelectProductCat;
	@FindBy(xpath="//input[@id='productName' ]")
	WebElement ProductName;
	@FindBy(xpath="//input[@id='manufacturingCompany' ]")
	WebElement Company;
	@FindBy(xpath="//input[@id='weight' ]")
	WebElement Packing;
	@FindBy(xpath="//input[@id='fk_unit_id']")
	WebElement Unit;
	@FindBy(xpath="//select[@id='fk_tax_id' ]")
	WebElement SelectTaxType;
	@FindBy(xpath="//input[@id='mrp' ]")
	WebElement MRP;
	@FindBy(xpath="//input[@id='buyPrice' ]")
	WebElement buyPrice;
	@FindBy(xpath="//input[@id='salePrice' ]")
	WebElement salePrice;
	@FindBy(xpath="//input[@id='hsn' ]")
	WebElement HSN;
	@FindBy(xpath="//input[@id='save']")
	WebElement SaveBtn;
	public ProductMgmtPageForFertilizer()
	{
		PageFactory.initElements(driver,this);
	}
	public void SelectFertilizercat()
	{
		SelectProductCat.sendKeys("FERTILIZER");

	}
	public void SelectSeedCat()
	{
		SelectProductCat.sendKeys("SEED");
	}
	public void SelectPesticideCat()
	{
		SelectProductCat.sendKeys("PESTICIDE");
	}
	
	public void AddDetails(String PrName,String compName,String Packking,String unit,String value,String MoRP,String BuyP,String SaleP,String Hsn)
	{
		ProductName.sendKeys(PrName);
		Company.sendKeys(compName);
		Packing.sendKeys(Packking);
		Unit.sendKeys(unit);
		Select dd1=new Select(SelectTaxType);
		dd1.selectByValue(value);
		MRP.sendKeys(MoRP);
		buyPrice.sendKeys(BuyP);
		salePrice.sendKeys(SaleP);
		HSN.sendKeys(Hsn);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",SaveBtn);
		SaveBtn.click();
		
	}
	
	



	

}
