package com.PageLayer;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;


public class PageClass extends BaseClass {
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	WebElement BMLogin;
	
	@FindBy(xpath="//button[@ng-class='btnClass1']")
	WebElement Addcust;

	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fname;

	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lname;

	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement postcode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Addcart;
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	WebElement OpenAccount;
	
	@FindBy(id="userSelect")
	WebElement selcustomer;
	@FindBy(id="currency")
	WebElement Selcurrency;
	
	@FindBy(xpath="//button[text()='Process']")
	WebElement Process;
	
	
	
	@FindBy(xpath="//button[@ng-click='showCust()']")
	WebElement Customer;
	
	@FindBy(xpath="//input[@ng-model='searchCustomer']")
	WebElement SearchCustomer;
	
	@FindBy(xpath="//td[text()='Harry']")
	WebElement SearchFname;

	public PageClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonBMLoginlink()
	{
		BMLogin.click();
	}
	public void addCustomer()
	{
		Addcust.click();
	}

	public void setupfName(String firstname) {
		fname.sendKeys(firstname);
	}

	public void setuplastnName(String lastname) {
		lname.sendKeys(lastname);
	}

	public void setuppostcode(String postcode1) {
		postcode.sendKeys(postcode1);
	}

	public void hadleAlert() {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void clickonAddcart()
	{
		Addcart.click();
	}
	public void clickonOpenAccount()
	{
		OpenAccount.click();
	}
	public void selectCustomer(String cutomer)
	{
	  Select sel=new Select(selcustomer);
      sel.selectByVisibleText(cutomer);		  
			  
			  
	}
	
	public void selectcurrency(String currency)
	{
		Select sel=new Select(Selcurrency);
	    sel.selectByVisibleText(currency);
	}
	
	public void clickOnprocess()
	{
		Process.click();
	}
	public void handleProcessAlert()
	{
		Alert alt2=driver.switchTo().alert();
		alt2.accept();
	}
	
	public void clickOnCustomer()
	{
		Customer.click();
  }
	public void searchCust(String custName)
	{
		SearchCustomer.sendKeys(custName);
	}
	public void VerifyCustomer(String VerifyName)
	{
		
		String CustVerify1="//td[text()='"+VerifyName+"']";
	     
		WebElement CustVerify= driver.findElement(By.xpath(CustVerify1));
		
		String custName=CustVerify.getText();
		
		Assert.assertEquals(VerifyName, custName);
		
	
	}
}
