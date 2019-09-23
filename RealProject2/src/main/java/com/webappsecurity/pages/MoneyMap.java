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

	@FindBy(id="//tr[@id=\"gridview-1021-bd-Spendings\"]/td/table/tbody/tr[2]/td[2]") WebElement TransportationAmount;
	
	
	
	public void getPIPlot()
	{
		
		
	}
	
	
	
    
	
	
}
