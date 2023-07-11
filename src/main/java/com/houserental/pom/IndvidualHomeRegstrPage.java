package com.houserental.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndvidualHomeRegstrPage {
	@FindBy(id="fullname")
	private WebElement nametxtbx;
	
	@FindBy(id="mobile")
	private WebElement mblnumtxtbx;
	
	@FindBy(id="alternat_mobile")
	private WebElement  altmblnumtxtbx;
	
	@FindBy(id="email")
	private WebElement emltxtbx;
	
	@FindBy(id="plot_number")
	private WebElement pltnumtxtbx;
	
	
	@FindBy(id="rooms")
	private WebElement roomstxtbx;
	
	@FindBy(id="country")
	private WebElement cntrytxtbx;
	@FindBy(id="state")
	private WebElement sttxtbx;
	@FindBy(id="city")
	private WebElement ctytxtbx;
	@FindBy(xpath="//h2[text()='Register Room']/..//input[@id='rent']")
	private WebElement rnttxtbx;
	@FindBy(id="deposit")
	private WebElement dpsttxtbx;
	@FindBy(id="accommodation")
	private WebElement accmdtntxtbx;
	@FindBy(id="description")
	private WebElement dsectxtbx;
	@FindBy(id="landmark")
	private WebElement lndmrktxtbx;
	@FindBy(id="address")
	private WebElement adrstxtbx;
	@FindBy(id="vacant")
	private WebElement vcnttxtbx;
	
	@FindBy(id="image")
	private WebElement imgtxtbx;
	
	@FindBy(name="register_individuals")
	private WebElement sbmtbtn;
	
	@FindBy(xpath="//h2[text()='Register Room']/../div[1]")
	private WebElement msg;
	
	
	
	public IndvidualHomeRegstrPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getNametxtbx() {
		return nametxtbx;
	}

	public WebElement getMblnumtxtbx() {
		return mblnumtxtbx;
	}

	public WebElement getAltmblnumtxtbx() {
		return altmblnumtxtbx;
	}

	public WebElement getEmltxtbx() {
		return emltxtbx;
	}

	public WebElement getPltnumtxtbx() {
		return pltnumtxtbx;
	}

	public WebElement getRoomstxtbx() {
		return roomstxtbx;
	}

	public WebElement getCntrytxtbx() {
		return cntrytxtbx;
	}

	public WebElement getSttxtbx() {
		return sttxtbx;
	}

	public WebElement getCtytxtbx() {
		return ctytxtbx;
	}

	public WebElement getRnttxtbx() {
		return rnttxtbx;
	}

	public WebElement getDpsttxtbx() {
		return dpsttxtbx;
	}

	public WebElement getAccmdtntxtbx() {
		return accmdtntxtbx;
	}

	public WebElement getDsectxtbx() {
		return dsectxtbx;
	}

	public WebElement getLndmrktxtbx() {
		return lndmrktxtbx;
	}

	public WebElement getAdrstxtbx() {
		return adrstxtbx;
	}

	public WebElement getVcnttxtbx() {
		return vcnttxtbx;
	}

	public WebElement getImgtxtbx() {
		return imgtxtbx;
	}

	public WebElement getSbmtbtn() {
		return sbmtbtn;
	}

	public WebElement getMsg() {
		return msg;
	}
	

}
