package com.houserental.pom;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApartmentListPage {



//@FindBy(xpath="//p[text()='']")
//private WebElement findunametbx;

	@FindBy(xpath="(//h2[text()='List of Apartment Details']/..//a)[last()]")
	private WebElement cmplbtn;

	public ApartmentListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	



	
	public WebElement getCmplbtn() {
		return cmplbtn;
	}






	public String test(WebDriver driver,String rname)
	{
		String ele = driver.findElement(By.xpath("//p[text()='"+rname+"']")).getText();
		return ele;
	}

}



