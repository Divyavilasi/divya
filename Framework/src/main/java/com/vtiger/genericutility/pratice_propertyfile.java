package com.vtiger.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class pratice_propertyfile {

	public String  readDataFrompf(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(Iconstantutility.propertyfilepath);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
