package com.aquaweb.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aquaweb.helper.Wait;

public class NavTree {	
	
	// locate tree via identifier pass the depth in order to choose which level should be expanded
	public static void expand(WebDriver driver, String identifier, int depth){
		if(driver.findElement(By.xpath(".//*[contains(@id,'"+identifier+"')]/td["+depth+"]/img")).getAttribute("alt").equalsIgnoreCase("[Expand]")){
			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td["+ depth+"]/img")).click();					
			System.out.println("Tree expanded on level td["+depth+"]");
		} else {
			System.out.println("Tree could not be located");
			System.out.println(".//*[contains(@id,'"+identifier+"')]/td["+depth+"]/img");
		}		
		Wait.waitForPageLoad(driver);
	}
	
	public static void collapse(WebDriver driver, String identifier, int depth){
		if(driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td["+ depth+"]/img")).getAttribute("alt").equalsIgnoreCase("[Collapse]")){
			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td["+ depth+"]/img")).click();
			System.out.println("Tree collapsed on level td["+depth+"]");
		} else {
			System.out.println("Tree could not be located");
		}
		Wait.waitForPageLoad(driver);
	}
	
	public static void createList(){
		
	}
	
	public static void chooseItem(){
		
	}
}
