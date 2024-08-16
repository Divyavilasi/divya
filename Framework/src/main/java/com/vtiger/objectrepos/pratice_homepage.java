package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutility.WebDriverUtility;

public class pratice_homepage extends WebDriverUtility{
	//declartion
	@FindBy(linkText="Organizations")private WebElement organizationsLnk;
	@FindBy(linkText="Contacts")private WebElement contactsLnk;
	@FindBy(linkText="Opportunities")private WebElement opportunitiesLnk;
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")private WebElement AdministratoImg;
	@FindBy(linkText = "Sign Out")private WebElement SignOutLnk;

	//Initialization
	public pratice_homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	//utilization

	public WebElement getOrganizationsLnk() {
		return organizationsLnk;
	}

	public WebElement getContactsLnk() {
		return contactsLnk;
	}

	public WebElement getOpportunitiesLnk() {
		return opportunitiesLnk;
	}

	public WebElement getAdministratoImg() {
		return AdministratoImg;
	}

	public WebElement getSignOutLnk() {
		return SignOutLnk;
	}
	//Business Library
	public void clickonorgLink(){
		organizationsLnk.click();;
	}
	public void clickoncontactsLink() {
		contactsLnk.click();
	}
	public void logoutfromApp(WebDriver driver) {
		moveToElement(driver, AdministratoImg);
			SignOutLnk.click();
		}
	
}
