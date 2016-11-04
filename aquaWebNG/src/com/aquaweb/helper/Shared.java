package com.aquaweb.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared {

	
	public static void explicitWait(WebDriver driver, String text){
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
	}
	
	public static void implicitWait(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
