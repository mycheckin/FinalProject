package com.webappsecurity.tests;

import org.testng.annotations.Test;

import com.webappsecurity.pages.HomePage;
import com.webappsecurity.pages.LoginPage;
import com.webappsecurity.pages.MoneyMap;

public class TestMoneyMap extends TestBase
{
	
	
	@Test
	public void testCollapsiable() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.clickSigninButton();
		logger.info("signin button clicked");
		
		//Enter credentials in login page
		LoginPage loginpage = new LoginPage(driver);
		if(loginpage.isPageDisplayed())
		loginpage.enterCredentials("username", "password");
		logger.info("Credentials entered");
		
		
		  MoneyMap moneyMap = new MoneyMap(driver);
		  moneyMap.moneyMapClick();
		  Thread.sleep(5000);
		
		  // Deposits 
		  if(moneyMap.info_DirectDeposit.isDisplayed()) 
		  {		  
			  moneyMap.collapsibleClick();
			  logger.info("Deposits button is collapsed..."); 
		  } 
		  
		  Thread.sleep(3000);
		  
		  if(!moneyMap.info_DirectDeposit.isDisplayed()) 
		  {			  
			  moneyMap.collapsibleClick();
			  logger.info("Deposits button is expanded..."); 
		  }
		  
		  // Spending 
		  if(moneyMap.info_Auto.isDisplayed()) 
		  {		   
		  moneyMap.collapsibleClick();
		  logger.info("1.Auto button is collapsed..."); 
		  } 
		  Thread.sleep(3000);
		  if(!moneyMap.info_Auto.isDisplayed()) 
		  { 			
			  moneyMap.collapsibleClick(); 
			  logger.info("2.Auto button is expanded..."); 
		  }
		 
		
		  //info Transport logger.info("info_TransportClick...");
		  moneyMap.info_TransportClick();
		 
		 
		  
		// Inflow-------------- 
		  if(moneyMap.info_DirectDeposit.isDisplayed()) 
		  {
			  logger.info("1. inside btn_Inflow..."); 
			  moneyMap.btn_Inflow.click();
			  
			  logger.info("btn_Inflow collapsed..."); 
			 } 
			 Thread.sleep(3000);
			  if(!moneyMap.info_DirectDeposit.isDisplayed()) 
			  {
			  logger.info("2.inside btn_Inflow..."); 
			  moneyMap.btn_Inflow.click();
			  logger.info("btn_Inflow is expanded..."); }
			  
		// Outflow---
		// Payment to zero Bank
		// Summary	
			  
			  
			  
			  
	}

}
