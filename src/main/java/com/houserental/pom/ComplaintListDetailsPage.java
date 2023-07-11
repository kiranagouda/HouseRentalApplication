package com.houserental.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintListDetailsPage {
	
	@FindBy(xpath="(//h2[text()='List of Apartment Details']/..//tr)[last()]")
	private WebElement cmplntinfo;
	
	
	public ComplaintListDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getCmplntinfo() {
		return cmplntinfo;
	}

	
	
}
