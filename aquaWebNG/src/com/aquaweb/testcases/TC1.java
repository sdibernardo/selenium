package com.aquaweb.testcases;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aquaweb.servicebuilder.Config;
import com.aquaweb.servicebuilder.Init;

public class TC1 {

	@BeforeClass
	public static void init(){
		Config.setBaseUrl("http://aqua-basecamp/aquawebng");
		Config.setBrowser("chrome");
	}
	
	@AfterClass
	public static void stopService() throws IOException{
		Init.createAndStartService(Config.getBrowser());
	}
	
	@Before
	public void newDriver(){
		Init.createDriver(Config.getBrowser());
	}
	
	@After
	public void quitDriver(){
		Init.quitDriver();
	}
	
	@Test
	public void Test1(){
		System.out.println("klappt");
	}

//	public void login() throws Throwable {
//		// open aqua WebClient
//		driver.get("http://aqua-basecamp/aquaWebNG");
//		
//		// login
//		driver.findElement(By.id("UserName_I")).sendKeys("bernarsa");
//		driver.findElement(By.id("Password_I")).sendKeys("Andagon#001");
//		driver.findElement(By.id("Button_CD")).click();
//		
//		explicitWait(driver, ".//*[@id='mainNavigationBar']/li[@data-panelid='Navigation']");
//		
//		// navigate to new window	   
//		driver.findElement(By.xpath(".//*[@id='mainNavigationBar']/li[@data-panelid='Navigation']")).click();
//		
//		implicitWait(driver, 2);
//	  
//		// expand first layer of tree, if not already expanded	  
//		if(driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[1]/img")).getAttribute("alt").equalsIgnoreCase("[Expand]")){
//			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[1]/img")).click();
//			System.out.println("Tree expanded");
//		}
//		else if (driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[1]/img")).getAttribute("alt").equalsIgnoreCase("[Collapse]")){
//			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[1]/img")).click();
//			System.out.println("Tree collapsed");		  
//		}
//		
//		explicitWait(driver, ".//*[contains(@id,'TreeListProjectTree_R')]/td[2]//img[contains(@src,'tree')]");
//		
//		// expand second layer of tree, if not already expanded
//		if(driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[2]//img[contains(@src,'tree')]")).getAttribute("alt").equalsIgnoreCase("[Expand]")) {
//			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[2]//img[contains(@src,'tree')]")).click();
//			System.out.println("Subtree expanded");
//		}
//		else if (driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[2]//img[contains(@src,'tree')]")).getAttribute("alt").equalsIgnoreCase("[Collapse]")){
//			driver.findElement(By.xpath(".//*[contains(@id,'TreeListProjectTree_R')]/td[2]//img[contains(@src,'tree')]")).click();
//			System.out.println("Subtree collapsed");
//		}		
//	}
	
//	@Test
//	public void newDefect() throws Throwable {
//		login();
//		explicitWait(driver, ".//*[@id='Ribbon_T0G0I0_PI']");
//		
//		// open new defect
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PI']")).click();
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PM_DXI1_T']")).click();		
//		implicitWait(driver, 2);
//		
//		// get window-handles to perform on the correct tab
//		ArrayList tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1).toString());
//		System.out.println(driver.getCurrentUrl());
//		
//		// wait until loaded
//		implicitWait(driver, 10);
//		
//		// fill in data for defect
//		driver.findElement(By.xpath(".//*[contains(@id,'Name_I')]")).sendKeys("TestDefect2");
//		driver.findElement(By.xpath(".//*[@id='FoundBuild_I']")).sendKeys("16.0.3");		
//		driver.findElement(By.xpath(".//*[@id='ImplementedIn_I']")).sendKeys("16.0.4");
//		
//		
//		driver.findElement(By.xpath(".//*[@id='FoundBuild_I']")).click();
//		// set status
//		driver.findElement(By.xpath(".//*[@id='Status_B-1Img']")).click();
//		driver.findElement(By.xpath(".//*[@id='Status_DDD_L_LBI1T0']")).click();
//		
//		// safe
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I1']")).click();
//					
//	}
	

//	@Test
//	public void linkDefect() throws Throwable {
//		login();
//	}
	
	
//	@Test
//	public void removeDefect() throws Throwable {
//		new_defect();
//		
//	}
	
	
//	@Test
//	public void sortElements() throws Throwable {
//		login();
//		
//		// Sort ascending
//		driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).click();
//		implicitWait(driver, 2);
//		// Sort descending
//		driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).click();
//		implicitWait(driver, 2);
//		// is arrow displayed 		
//		System.out.println("Arrow displayed: " + driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col1']//td[contains(@class, 'dx-ellipsis')]")).isDisplayed());
//	}
	
//	@Test
//	public void filterElements() throws Throwable {
//		login();		
//		
//		// click filter icon
//		explicitWait(driver, ".//*[@id='ItemBrowserGridView_col11']//img[contains(@alt,'[Filter]')]");
//		driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_col11']//img[contains(@alt,'[Filter]')]")).click();
//		
//		// choose Filter to apply
//		driver.findElement(By.xpath(".//*[@id='ItemBrowserGridView_HFListBox_LBI4T0']")).click();				
//	}
	
//	@Test
//	public void newTestcase() throws Throwable {
//		login();
//		explicitWait(driver, ".//*[@id='Ribbon_T0G0I0']");
//		
//		// open new test case
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0']")).click();
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0_PM_DXI0_T']")).click();		
//		implicitWait(driver, 2);
//		
//		// get window-handles to perform on the correct tab
//		ArrayList tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1).toString());
//		System.out.println(driver.getCurrentUrl());
//		
//		// wait until loaded
//		explicitWait(driver, ".//*[@id='Name_I']");
//		
//		// fill in data for test case
//		driver.findElement(By.xpath(".//*[@id='Name_I']")).sendKeys("TestCase1");
//		
//		// safe
//		driver.findElement(By.xpath(".//*[@id='Ribbon_T0G0I0']")).click();
//
//		
//	}
	
//	@Test
//	public void removeTestcase() throws Throwable {
//		
//		
//	}
//	
//	@Test
//	public void runTestcase() throws Throwable {
//		
//		
//	}
//	
//	@Test
//	public void stepDesigner() throws Throwable {
//		
//		
//	}
//	
//	@Test
//	public void changeSequence() throws Throwable {
//		
//		
//	}
//	
//	@Test
//	public void removeStep() throws Throwable {
//		
//		
//	}
//	
//	@Test
//	public void markAsIrrelevant() throws Throwable {
//		
//		
//	}
	
	
}