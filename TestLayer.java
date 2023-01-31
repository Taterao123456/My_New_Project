package com.TestLayer;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.PageClass;

public class TestLayer extends BaseClass {
	PageClass login;
	
	@BeforeClass
	 public void setup()
	{
		login.initialization();
	}
	
//	@Test(priority=1)
//	public void addCustomer()
//	{
//		PageClass page=new PageClass();
//		page.clickonBMLoginlink();
//		page.addCustomer();
//		page.setupfName("Taterao");
//		page.setuplastnName("Gaikwad");
//		page.setuppostcode("585326");
//		page.clickonAddcart();
//		page.hadleAlert();
//		
//		
//	}
	
	@Test(priority=1)
	public void CustomerClass()
	{
		PageClass page=new PageClass();
		
		page.clickonBMLoginlink();
		page.addCustomer();
		page.setupfName("Taterao");
		page.setuplastnName("Gaikwad");
		page.setuppostcode("585326");
		page.clickonAddcart();
		page.hadleAlert();
		page.clickonOpenAccount();
		page.selectCustomer("Taterao Gaikwad");
		page.selectcurrency("Rupee");
		page.clickOnprocess();
		page.handleProcessAlert();
		page.clickOnCustomer();
		page.searchCust("Taterao");
	    page.VerifyCustomer("Taterao");
		
	
		
	}
	
	{
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
}
