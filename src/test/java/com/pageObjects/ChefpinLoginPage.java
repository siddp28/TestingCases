package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChefpinLoginPage {
	

	WebDriver ldriver;

	public ChefpinLoginPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Click on password
	@FindBy(linkText="Password")
	WebElement password;
	
	//Enter username
	@FindBy(id="exampleInputEmail1")
	WebElement email;
	
	//Enter Password
	@FindBy(id="Password")
	WebElement pswd;
	
	//Submit
	@FindBy(css="button[type='submit']")
	WebElement submit;
	
	
	//Imp for Password
	public void clickPassword() {
		password.click();
	}
	public void setUsername(String username) {
		email.sendKeys(username);
	}
	
	public void setPassword(String pd) {
		pswd.sendKeys(pd);
	}
	
	public void clickSubmit() {
		submit.click();;
	}
}
