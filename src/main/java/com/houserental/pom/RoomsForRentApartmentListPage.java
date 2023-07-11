package com.houserental.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoomsForRentApartmentListPage {
	public String verifyuname(WebDriver driver,String rname)
	{
		String usrnme = driver.findElement(By.xpath("//p[text()='"+rname+"']")).getText();
		return usrnme;
	}
}
