package com.vtiger.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepos.HomePage;
import com.vtiger.objectrepos.Loginpage;

public class Base {
	public propertfileutility putil = new propertfileutility();
	public ExcelFileUtility eutil = new ExcelFileUtility();
	public Javautility jutil = new Javautility();
	public WebDriverUtility wutil = new WebDriverUtility();
	//runtime polymorphism
	public WebDriver driver = null;

	@BeforeSuite
	public void bsconfig() {
		Reporter.log("DB connection",true);
	}
	@AfterSuite
	public void asconfig() {
		Reporter.log("DB DISCONNECTION",true);
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = putil.readDataFromPf("browser");
		String URL = putil.readDataFromPf("url");
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
			Reporter.log("chromeBrowser has launched",true);
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
			Reporter.log("EdgeBrowser has Launched",true);
		}
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
			Reporter.log("FireFoxBrowser has Launched",true);
		}
		else {
			System.out.println("Boss U have given Invalid Browser name into PropertyFile");
		}
		driver.get(URL);
		wutil.maximimizeWindow(driver);
		wutil.waitForPageLoad(driver);
		Reporter.log("launch browser",true);
	}
@AfterClass
public void teardown() {
	driver.quit();
	Reporter.log("close browser",true);
}
@BeforeMethod
public void loginToAPP() throws Throwable {
	String UN = putil.readDataFromPf("un");
	String PWD = putil.readDataFromPf("pwd");
	Loginpage lp = new Loginpage(driver);
	lp.loginToApp(UN, PWD);
	Reporter.log("User  gets Login To app Successfully",true);	
}
@AfterMethod
public void logutfromapp() {
	HomePage hp = new HomePage(driver);
	hp.logoutfromApp(driver);
	Reporter.log("User  gets Logout From app Successfully",true);
}
}

