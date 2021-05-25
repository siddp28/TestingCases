package com.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 //Chefpin
	public String ChefpinLoginUrl ="https://dev.chefp.in/diner-signin-with-otp";
	public String ChefpinUsername ="dinerOne@yopmail.com";
	public String ChefpinPassword ="123456";
	
	
	public String baseUrl ="https://demo.guru99.com/v4/";
	public String username ="mngr164225";
	public String password="jahetAp";
	public static WebDriver driver;
	public static Logger Logger;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 Logger = org.apache.log4j.Logger.getLogger(BaseClass.class);
		 PropertyConfigurator.configure("log4j2.properties");
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
