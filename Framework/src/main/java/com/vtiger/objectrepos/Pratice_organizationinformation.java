package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pratice_organizationinformation {
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement OrgHeaderText;

	public Pratice_organizationinformation (WebDriver driver) // test script
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgHeaderText() {
		return OrgHeaderText;
	}
//Business Library
			public String getHeader()
			{
				return OrgHeaderText.getText();
			}
		
	
}
