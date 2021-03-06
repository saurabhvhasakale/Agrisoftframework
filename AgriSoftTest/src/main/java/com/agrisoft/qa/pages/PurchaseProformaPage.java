package com.agrisoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseProformaPage {
	
	@FindBy(xpath="//select[@id='customertype1']")
	WebElement SelectCustomerType;
	@FindBy(xpath="//input[@id='creditCustomer']")
	WebElement CustomerName;
	@FindBy(xpath="//input[@id='village1']")
	WebElement CityName;
	@FindBy(xpath="//input[@id='contactNo1']")
	WebElement ContactNo;
	@FindBy(xpath="//input[@id='gstNo1']")
	WebElement GSTNo;
	@FindBy(xpath="//input[@id='emailid']")
	WebElement EmailId;
	@FindBy(xpath="//input[@id='billdate']")
	WebElement BillDate;
	
	
	

}
