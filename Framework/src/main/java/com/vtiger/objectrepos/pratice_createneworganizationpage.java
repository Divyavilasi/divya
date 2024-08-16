package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pratice_createneworganizationpage {
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgnamet;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;

	//Initailization
		public pratice_createneworganizationpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		public WebElement getOrgnamet() {
			return orgnamet;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
//Business Library
		public void createNewOrganization(String ORGNAME)
		{
			orgnamet.sendKeys(ORGNAME);
			saveBtn.click();
		}

}
