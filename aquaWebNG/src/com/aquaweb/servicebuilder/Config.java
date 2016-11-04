package com.aquaweb.servicebuilder;

public class Config {

	private static String sBaseUrl = "";
	private static String browser = "";
	
	private static String cdProp = "webdriver.chrome.driver";
	private static String gdProp = "webdriver.gecko.driver";
	private static String ieProp = "webdriver.ie.driver";
	private static String cdPath = "C:/Program Files/Eclipse/Selenium/chromedriver.exe";
	private static String gdPath = "C:/Program Files/Eclipse/Selenium/wires.exe";
	private static String iePath = "C:/Program Files/Eclipse/Selenium/IEDriverServer.exe";
	
	
	public static String getsBaseUrl() {
		return sBaseUrl;
	}
	public static String getCdProp() {
		return cdProp;
	}
	public static String getGdProp() {
		return gdProp;
	}
	public static String getIeProp() {
		return ieProp;
	}
	public static String getCdPath() {
		return cdPath;
	}
	public static String getGdPath() {
		return gdPath;
	}
	public static String getIePath() {
		return iePath;
	}
	public static String getBaseUrl() {
		return sBaseUrl;
	}
	public static void setBaseUrl(String sBaseUrl) {
		Config.sBaseUrl = sBaseUrl;
	}
	public static String getBrowser() {
		return browser;
	}
	public static void setBrowser(String browser) {
		Config.browser = browser;
	}
	
}


