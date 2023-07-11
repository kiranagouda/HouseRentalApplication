package com.houserental.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="exampleInputEmail1")
	private WebElement emailtxtbx;
	
	
	@FindBy(id="exampleInputPassword1")
	private WebElement pwdtxtbx;
	
	@FindBy(name="login")
	private WebElement lgbtn;
	
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailtxtbx() {
		return emailtxtbx;
	}

	public WebElement getPwdtxtbx() {
		return pwdtxtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	
	
	
	
	
}
