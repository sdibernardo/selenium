package com.aquaweb.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aquaweb.servicebuilder.Config;

public class Shared {	

	public static void login(WebDriver driver){
		// open aqua WebClient
		driver.get(Config.getBaseUrl());
		
		// login
		driver.findElement(By.id("UserName_I")).sendKeys("bernarsa");
		driver.findElement(By.id("Password_I")).sendKeys("Andagon#001");
		driver.findElement(By.id("Button_CD")).click();	
		
		Wait.waitForPageLoad(driver);
	}	
}
