package com.vtiger.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pratice_webdriver_utility {
	/**
	 * this method is used to maximize window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the window
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method wait till entire webpage is loaded
	 * @param driver
	 */
	
	public void waitforpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * This method is used to handle the DD with the help of Index
	 * @param ele
	 * @param index
	 */
	public void dropdown(WebElement ele,int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}
	/**
	 *  This method is used to handle the DD with the help of value
	 * @param ele
	 * @param value
	 */
	public void dropdown(WebElement ele,String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
		
		/**
		 *  This method is used to handle the DD with the help of text
		 * @param text
		 * @param ele
		 */
		public void dropdown(String text,WebElement ele ) {
			Select s = new Select(ele);
			s.selectByVisibleText(text);
		}
		}
	

		
	


