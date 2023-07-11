package com.houserental.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintListPage {
	
	
	@FindBy(id="name")
	private WebElement pltnametbx;

	@FindBy(id="cmp")
	private WebElement cmplnttbx;
	
	@FindBy(name="register")
	private WebElement submitbtn;
	
	
	public ComplaintListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPltnametbx() {
		return pltnametbx;
	}

	public WebElement getCmplnttbx() {
		return cmplnttbx;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}




}
