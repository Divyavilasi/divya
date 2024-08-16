package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutility.WebDriverUtility;

public class Pratice_organizationpage  {
	//declarion
	@FindBy(xpath="themes/softed/images/btnL3Add.gif")private WebElement orgLookupImg;
//initization 
	public Pratice_organizationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//getters
	public WebElement getOrgLookupImg() {
		return orgLookupImg;
	}
//Business Library
	public void clickOnOrgLookUpImg()
	{
		orgLookupImg.click();
	}
	}
