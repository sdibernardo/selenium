package com.aquaweb.servicebuilder;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Init {
	
	private static ChromeDriverService cdService;
	private static GeckoDriverService gdService;
	private static InternetExplorerDriverService ieService;
	
	private static WebDriver wDriver;	
	
	public static WebDriver getDriver() {
		return wDriver;
	}

	public static void createAndStartService(String service) throws IOException {
		
		switch(service){
		case "chrome":
			cdService = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(Config.getCdPath()))
			    .usingAnyFreePort()
			    .build();
			cdService.start();
			break;
		case "firefox":
			gdService = new GeckoDriverService.Builder()
				.usingDriverExecutable(new File(Config.getGdPath()))
				.usingAnyFreePort()
				.build();
			gdService.start();
			break;
		case "ie":
			ieService = new InternetExplorerDriverService.Builder()
				.usingDriverExecutable(new File(Config.getIePath()))
				.usingAnyFreePort()
				.build();
			ieService.start();
			break;
		}
		
		System.out.println("Service started for "+service);
	}

	public static void createAndStopService(String service) {
		switch(service){
		case "chrome":
			cdService.stop();
			break;
		case "firefox":
			gdService.stop();
			break;
		case "ie":
			ieService.stop();
			break;
		}
		
		System.out.println("Service stopped for "+service);
	}
		
	public static void createDriver(String service) {
		switch(service){
		case "chrome":
			System.setProperty(Config.getCdProp(), Config.getCdPath());
			wDriver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty(Config.getGdProp(), Config.getGdPath());
			wDriver = new MarionetteDriver();
			break;
		case "ie":
			System.setProperty(Config.getIeProp(), Config.getIePath());
			wDriver = new InternetExplorerDriver();
			break;
		}			
		System.out.println("Driver running for "+service);
	}

	public static void quitDriver() {
		wDriver.quit();
		System.out.println("Driver quit");
	}	

}
