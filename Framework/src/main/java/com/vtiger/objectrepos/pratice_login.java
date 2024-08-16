package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pratice_login {
	//declaration
	@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pswdtxt;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;
	//initilization
	public pratice_login(WebDriver driver) {
		//pagefactory is factory is one class in that class we have onemethod initelements which we are access altest session id
		PageFactory.initElements(driver,this);
		}
	//utilization
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPswdtxt() {
		return pswdtxt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Business Library
	public void logintoapp(String UN,String PWD) {
		untxt.sendKeys(UN);
		pswdtxt.sendKeys(PWD);
		loginBtn.click();
	}
}
