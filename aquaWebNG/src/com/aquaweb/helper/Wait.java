package com.aquaweb.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	// Wait for 10 seconds until presence of element is located
	public static void explicitWait(WebDriver driver, String text){
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(text)));
	}
	
	
	// Poll DOM until ready
	public static void implicitWait(WebDriver driver, int time){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// Wait for page to be fully loaded
	public static boolean waitForPageLoad(WebDriver driver){		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		// wait for jQuery
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try{
					return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);					
				} catch (Exception e) {
					// no jQuery present
					return true;
				}				
			}			
		};
		
		// wait for JS 
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {				
				return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");								
			}			
		};		
		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}
	
}
