package com.webappsecurity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MoneyMap extends BasePage
{

	public MoneyMap(WebDriver driver) 
	{
		super(driver);		
	}
	
	public @FindBy(xpath="//*[@id=\"money_map_tab\"]/a")
	WebElement lnk_MoneyMap;
			
	// ------------- button -----------------------------
	public @FindBy(xpath="//*[@id=\"gridview-1015-hd-Deposits\"]/td/div/div") 
	WebElement btn_DirectDeposit;
	
	public @FindBy(xpath="//*[@id=\"gridview-1021-hd-Spendings\"]/td/div/div") 
	WebElement btn_Spending;
	
	public @FindBy(xpath="//*[@id=\"tool-1032-toolEl\"]") 
	WebElement btn_Inflow;
	
	public @FindBy(xpath="//*[@id=\"tool-1033-toolEl\"]") 
	WebElement btn_Outflow;
	
	
	
	
	// ------------- Info-----------------------------	
	public @FindBy(xpath="//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[2]/td[3]/div/img") 
	WebElement info_DirectDeposit;
	
	public @FindBy(xpath="//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[3]/td[3]/div/img") 
	WebElement info_otherDeposit;
	
	public @FindBy(xpath="//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[4]/td[3]/div/img") 
	WebElement info_ZeroBankAcc;

	public @FindBy(xpath="//*[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[2]/td[3]/div/img") 
	WebElement info_Transport;
	
	public @FindBy(xpath="//*[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[3]/td[3]/div/img") 
	WebElement info_Auto;
	
	public @FindBy(xpath="//*[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[4]/td[3]/div/img") 
	WebElement info_Charity;
	
	public @FindBy(xpath="//*[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[5]/td[3]/div/img") 
	WebElement info_Checks;
	
	public @FindBy(xpath="//*[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[5]/td[3]/div/img") 
	WebElement info_Retail;
	
	
	// ------------- text -----------------------------
	public @FindBy(xpath="//*[@id=\"gridview-1031\"]/table/tbody/tr[2]/td[1]/div[text()='Total Inflow']") 
	WebElement txt_TotalInflow;
	
	
	public void moneyMapClick()
	{
		lnk_MoneyMap.click();
	}
	
	public void collapsibleClick()
	{
		btn_DirectDeposit.click();
	}		
	
	public void info_DirectDepositClick()
	{
		info_DirectDeposit.click();
	}
	
	public void info_TransportClick()
	{
		info_Transport.click();
	}
	public void info_AutoClick()
	{
		info_Auto.click();
	}
	
	public void txt_TotalInflowClick()
	{
		info_Auto.click();
	}
	
	
}
