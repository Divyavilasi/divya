package com.vtiger.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertfileutility {
	/**
	 * this method is used to fetch the data from property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	public String readDataFromPf(String key) throws Throwable {		
		FileInputStream fis = new FileInputStream(Iconstantutility.propertyfilepath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}

}
