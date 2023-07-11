package com.houserental.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHome {

	@FindBy(xpath="//a[text()='Register']")
	private WebElement rgstrlink;
	
	@FindBy(linkText="Details/Update")
	private WebElement detailslnk;
	
	@FindBy(linkText="Home")
	private WebElement homelink;
	
	@FindBy(xpath="//b[text()='Rooms for Rent: ']/span")
	private WebElement roomsfrrentlink;
	
	@FindBy(linkText="Complaint List")
	private WebElement cmplntlstlink;
	
	
	public AdminHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getRgstrlink() {
		return rgstrlink;
	}

	public WebElement getDetailslnk() {
		return detailslnk;
	}

	public WebElement getHomelink() {
		return homelink;
	}

	public WebElement getRoomsfrrentlink() {
		return roomsfrrentlink;
	}

	public WebElement getCmplntlstlink() {
		return cmplntlstlink;
	}


}
