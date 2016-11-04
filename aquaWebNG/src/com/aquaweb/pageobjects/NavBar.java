package com.aquaweb.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aquaweb.helper.Wait;

public class NavBar {

	
	public static void navigateTo(WebDriver driver, String navTo){
		driver.findElement(By.xpath(".//*[@id='mainNavigationBar']/li[@data-panelid='"+navTo+"']")).click();
		Wait.waitForPageLoad(driver);
	}		
	
}
