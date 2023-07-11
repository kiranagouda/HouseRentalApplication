package com.houserental.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImplementation implements ITestListener {

	public void onFinish(ITestContext context) {

	}

	public void onStart(ITestContext context) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
	String methoname=result.getMethod().getMethodName();
	TakesScreenshot takescreenshot=(TakesScreenshot) BaseClass.sdriver;
	File src=takescreenshot.getScreenshotAs(OutputType.FILE);
	
	LocalDateTime dt=LocalDateTime.now();
	String dateTime=dt.toString().replace(" ","_").replace(":","_");
	File dst=new File("./Screenshots/"+methoname+"_"+dateTime+".png");
	try
	{
		FileUtils.copyFile(src, dst);
	
	}catch(IOException e)
	{
	e.printStackTrace();
	}
	}
	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}
	
	

}
