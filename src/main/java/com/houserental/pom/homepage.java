package com.houserental.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

		@FindBy(xpath="//a[text()='Search']")
		private WebElement searchlink;
		
		@FindBy(xpath="//a[text()='Login']")
		private WebElement loginlink;
		
		@FindBy(xpath="//a[text()='Register']")
		private WebElement registerlink;
		
		@FindBy(xpath="//a[text()='Logo/Home']")
		private WebElement logolink;
		
		@FindBy(id="keywords")
		private WebElement keywordstxtbx;
		
		@FindBy(id="location")
		private WebElement loctxtbx;
		
		@FindBy(name="search")
		private WebElement searchbtn;
		
		public homepage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}


		public WebElement getSearchlink() {
			return searchlink;
		}

		public WebElement getLoginlink() {
			return loginlink;
		}

		public WebElement getRegisterlink() {
			return registerlink;
		}

		public WebElement getLogolink() {
			return logolink;
		}

		public WebElement getKeywordstxtbx() {
			return keywordstxtbx;
		}

		public WebElement getLoctxtbx() {
			return loctxtbx;
		}

		public WebElement getSearchbtn() {
			return searchbtn;
		}
		
		
		
}
