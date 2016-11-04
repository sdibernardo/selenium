package com.aquaweb.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aquaweb.helper.Shared;
import com.aquaweb.helper.Wait;
import com.aquaweb.pageobjects.NavBar;
import com.aquaweb.pageobjects.NavTree;
import com.aquaweb.servicebuilder.Config;
import com.aquaweb.servicebuilder.Init;

public class TC1 {

	private static WebDriver wDriver;
	
	@BeforeClass
	public static void init() throws IOException{
		Config.setBaseUrl("http://aqua-basecamp/aquawebng");
		Config.setBrowser("chrome");
		Init.createAndStartService(Config.getBrowser());
	}
	
	@AfterClass
	public static void stopService(){
		Init.createAndStopService(Config.getBrowser());
	}
	
	@Before
	public void newDriver(){
		Init.createDriver(Config.getBrowser());
		wDriver = Init.getDriver();
	}
	
	@After
	public void quitDriver(){
		Init.quitDriver();
	}
	
	/**********************************************************************************************************************************
	 **********************************************************************************************************************************
	 **********************************************************************************************************************************
	 ***********************************************TESTCASES START HERE***************************************************************
	 **********************************************************************************************************************************
	 **********************************************************************************************************************************
	 **********************************************************************************************************************************/
	
	
	@Test
	public void newDefect() {
		Shared.login(wDriver);	
		NavBar.navigateTo(wDriver, "Navigation");	
		// open new defect
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PI']")).click();
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PM_DXI1_T']")).click();		
		
		
		// get window-handles to perform on the correct tab
		ArrayList tabs = new ArrayList<String> (wDriver.getWindowHandles());
		wDriver.switchTo().window(tabs.get(1).toString());
		System.out.println(wDriver.getCurrentUrl());
		
		// wait until loaded
		Wait.waitForPageLoad(wDriver);
		
		// fill in data for defect
		wDriver.findElement(By.xpath(".//*[contains(@id,'Name_I')]")).sendKeys("TestDefect2");
		wDriver.findElement(By.xpath(".//*[@id='FoundBuild_I']")).sendKeys("16.0.3");		
		wDriver.findElement(By.xpath(".//*[@id='ImplementedIn_I']")).sendKeys("16.0.4");
		
		
		wDriver.findElement(By.xpath(".//*[@id='FoundBuild_I']")).click();
		// set status
		wDriver.findElement(By.xpath(".//*[@id='Status_B-1Img']")).click();
		wDriver.findElement(By.xpath(".//*[@id='Status_DDD_L_LBI1T0']")).click();
		
		// safe
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I1']")).click();
					
	}
	

	@Test
	public void linkDefect() {
		
	}
	
	
//	@Test
//	public void removeDefect() {
//		Shared.login(wDriver);	
//		NavBar.navigateTo(wDriver, "Navigation");
//		
//	}
	
	
	@Test
	public void sortElements() {
		Shared.login(wDriver);	
		NavBar.navigateTo(wDriver, "Navigation");
		
		// Sort ascending
		wDriver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).click();
		
		// Sort descending
		wDriver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).click();
		
		// is arrow displayed 		
		System.out.println("Arrow displayed: " + wDriver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).isDisplayed());
	}
	
	@Test
	public void filterElements() {
		Shared.login(wDriver);	
		NavBar.navigateTo(wDriver, "Navigation");
		// click filter icon
		
		wDriver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col11']//img[contains(@alt,'[Filter]')]")).click();
		
		// choose Filter to apply
		wDriver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_HFListBox_LBI4T0']")).click();				
	}
	
	@Test
	public void newTestcase() {
		Shared.login(wDriver);	
		NavBar.navigateTo(wDriver, "Navigation");
		
		// open new test case
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0']")).click();
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PM_DXI0_T']")).click();		
		
		// get window-handles to perform on the correct tab
		ArrayList tabs = new ArrayList<String> (wDriver.getWindowHandles());
		wDriver.switchTo().window(tabs.get(1).toString());
		System.out.println(wDriver.getCurrentUrl());
		
		// wait until loaded
		Wait.waitForPageLoad(wDriver);
		
		// fill in data for test case
		wDriver.findElement(By.xpath(".//*[@id='Name_I']")).sendKeys("TestCase1");
		
		// safe
		wDriver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0']")).click();		
	}
	
	@Test
	public void removeTestcase() {
		
		
	}
	
	@Test
	public void runTestcase() {
		
		
	}
	
	@Test
	public void stepDesigner() {
		
		
	}
	
	@Test
	public void changeSequence() {
		
		
	}
	
	@Test
	public void removeStep() {
		
		
	}
	
	@Test
	public void markAsIrrelevant() {
		
		
	}
	
	
}