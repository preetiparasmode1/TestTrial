package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility{
public static String readProperties(String keys)throws Exception  {
	Properties pp = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\cofig.properties");
	return keys;
	
	
}
}
