package com.aquaweb.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableFilter {

	public static void clickFilter(WebDriver driver){
		driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col11']//img[contains(@alt,'[Filter]')]")).click();
		
	}
	
}
