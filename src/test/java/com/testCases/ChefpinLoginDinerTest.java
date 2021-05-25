package com.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.pageObjects.ChefpinLoginPage;

import demo.Log4jDemo;

public class ChefpinLoginDinerTest extends BaseClass{

	@Test
	public void ChefpinLoginDinerTest() throws InterruptedException {
		driver.get(ChefpinLoginUrl);
		Logger.info("Base url opened");
		driver.manage().window().maximize();
		Logger.info("Base url opened");
		ChefpinLoginPage clp = new ChefpinLoginPage(driver);
		clp.clickPassword();
		clp.setUsername(ChefpinUsername);
		clp.setPassword(ChefpinPassword);
		clp.clickSubmit();
		Thread.sleep(3000);
		
	String currentUrl = driver.getCurrentUrl();
	if(currentUrl.contentEquals("https://dev.chefp.in/diner-homepage")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	}
}
