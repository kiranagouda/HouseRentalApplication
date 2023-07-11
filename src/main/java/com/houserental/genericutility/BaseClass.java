package com.houserental.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.houserental.pom.LoginPage;
import com.houserental.pom.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//private static final String ENV_FILE_PATH = null;
	 FileUtlity fi=new FileUtlity();
	JavaUtlity jLib = new JavaUtlity();
	ExcelUtlity eLib = new ExcelUtlity();
	
	//WebDriverManager.chromedriver().setup();

public static WebDriver sdriver;
public WebDriver driver;


    //@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regTest"})
	public void openBrowser() throws Throwable          //openBrowser(String BROWSER)
	{
	

	//WebDriver driver = null;
	String ENV_FILE_PATH=fi.getFilePathFromPropertiesFile("projectConfigDataFilePath");

    String BROWSER = fi.getDataFromProperties(ENV_FILE_PATH, "browser");  //
    String URL = fi.getDataFromProperties(ENV_FILE_PATH, "url");
//String BROWSER=System.getProperty("browser");
//String URL=System.getProperty("url");

	/*step 1 : login to app*/
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}else if(BROWSER.equalsIgnoreCase("firefox")) {
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
	}else if(BROWSER.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}else {
	    driver = new ChromeDriver();
	}
	driver.get(URL);
	sdriver=driver;

System.out.println("browser is launched");
	}
	
	@BeforeMethod(groups= {"smokeTest","regTest"})
	public void loginToApplication() throws Throwable
	{
		WebActionUtility wLib = new WebActionUtility();

	    String TEST_SCRIPT_EXCEL_FILE_PATH =fi.getFilePathFromPropertiesFile("testScriptdatafilePath");
		String ENV_FILE_PATH=fi.getFilePathFromPropertiesFile("projectConfigDataFilePath");

	    String USERNAME = fi.getDataFromProperties(ENV_FILE_PATH, "username");
	    String PASSWORd = fi.getDataFromProperties(ENV_FILE_PATH, "password");
		homepage hp=new homepage(driver);

		LoginPage lp=new LoginPage(driver);
		wLib.waitForElementInDOM(driver);

		hp.getLoginlink().click();
		lp.getEmailtxtbx().sendKeys(USERNAME);
		lp.getPwdtxtbx().sendKeys(PASSWORd);
		lp.getLgbtn().click();

System.out.println("successfully logged in");

}
}