package com.agrisoft.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.agrisoft.qa.base.TestBase;

public class PurchaseGoodReceivedPage extends TestBase{
	
	public Select dd;
	public WebElement input;

	@FindBy(xpath="//select[@id='godown']")
	WebElement SelectGodown;
	@FindBy(xpath="//input[@id='supplier']")
	WebElement SelectSupplierName;
	@FindBy(xpath="//input[@id='billNum']")
	WebElement BillNo;
	@FindBy(xpath="//input[@id='fk_cat_id']")
	WebElement ProductCategory;
	@FindBy(xpath="//input[@id='proName']")
	WebElement ProductName;
	@FindBy(xpath="//input[@id='purchaseDate']")
	WebElement PurchaseDate;
	@FindBy(xpath="//div[@id='gbox_jqGrid']")
	WebElement Grid;
	@FindBy(xpath="//table[@id='F']")
	WebElement Grid1;
	@FindBy(xpath="/html/body/div[4]/div[2]/div/form/fieldset/div[8]/div/div[3]/div[5]/div/table/tbody/tr[2]/td[16]/input")
	WebElement GridQuantity;
	@FindBy(xpath="//table[@id='jqGrid']//tr//td[20]")
	WebElement TotalClick;
	@FindBy(xpath="//table[@id='jqGrid']//tr//td[21]")
	WebElement BatchNo;
	@FindBy(xpath="//input[@id='0_expiryDate']")
	WebElement ClickOnExpiryDate;
	@FindBy(xpath="//a[@class='ui-state-default' and text()='10']")
	WebElement SelectPurchaseDate;
	@FindBy(xpath="//input[@id='otherExpencesGSTPercentage']")
	WebElement hamaliTaxType;
	@FindBy(xpath="//input[@id='otherExpenceAmount']")
	WebElement hamaliAmount;
	@FindBy(xpath="//input[@id='transportationExpencePercent']")
	WebElement TransportTaxType;
	@FindBy(xpath="//input[@id='transportationAmount']")
	WebElement TransportAmount;
	@FindBy(xpath="//input[@id='btn']")
	WebElement SaveBtn;
	
	public PurchaseGoodReceivedPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void Godown1()
	{
		dd=new Select(SelectGodown);

		dd.selectByIndex(1);
	}
	public void Godown2()
	{
		dd=new Select(SelectGodown);

		dd.selectByIndex(1);
	}
	public void Godown3()
	{
		dd=new Select(SelectGodown);

		dd.selectByIndex(3);
	}

	public void selctcatFertilzer()
	{
	   ProductCategory.sendKeys("FERTILIZER");
		
	}
	public void  selctcatSEED()
	{
		ProductCategory.sendKeys("SEED");
	}
	public void selctcatPesticide()
	{
		ProductCategory.sendKeys("PESTICIDE");
	}
	
	
	public void MakeGoodRecieve(String Sname,String Bno,String PrNo,String QTY,String BaNo)
	{
		SelectSupplierName.sendKeys(Sname);
		BillNo.sendKeys(Bno);
		ProductName.sendKeys(PrNo);
		ProductName.sendKeys(Keys.TAB);
		GridQuantity.click();
		GridQuantity.sendKeys(QTY);
		BatchNo.click();
		BatchNo.sendKeys(BaNo);
		
		
	}
	
	
}
