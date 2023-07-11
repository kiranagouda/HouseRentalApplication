package houserental.AdminTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.houserental.genericutility.BaseClass;
import com.houserental.genericutility.ExcelUtlity;
import com.houserental.genericutility.FileUtlity;
import com.houserental.genericutility.JavaUtlity;
import com.houserental.genericutility.WebActionUtility;
import com.houserental.pom.AdminHome;
import com.houserental.pom.ApartmentListPage;
import com.houserental.pom.IndvidualHomeRegstrPage;
import com.houserental.pom.LoginPage;
import com.houserental.pom.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.houserental.genericutility.ITestListenerImplementation.class)
public class AdminLoginTest extends  BaseClass {
@Test(groups="smokeTest")
	public void AdmnLgn() throws Throwable
{
		//WebDriverManager.chromedriver().setup();

	//WebActionUtility wLib = new WebActionUtility();
	//System.out.println(URL);
	//FileInputStream fis=new FileInputStream("./data/commondata1.property");
	//Properties p=new Properties();
	//p.load(fis);
	//String URL=p.getProperty("url");
	//String USERNAME=p.getProperty("username");
	//String PASSWORD=p.getProperty("password");
	 FileUtlity fi=new FileUtlity();
	 JavaUtlity jLib=new JavaUtlity();
	 ExcelUtlity eLib = new ExcelUtlity();

    String TEST_SCRIPT_EXCEL_FILE_PATH =fi.getFilePathFromPropertiesFile("testScriptdatafilePath");

	int randomnum=jLib.getRandomNumber();
	String countryName = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Country");
	String stateName = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "State");
	String cityName = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "City");
	String rent = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Rent");
	String dpst = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Deposit");
	String accmdtn = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet2", "tc_01", "Accommondation");
	String desc = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet2", "tc_01", "Description");
	String lndmrk = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet2", "tc_01", "Landmark");
	String addrs = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Address");
	String expctdtest = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet2", "tc_01", "MSG");
	String name = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "FullName");
	String mbnum = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Mobile_No");
	String altmbnum = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "AltNum");
	String eml = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Email_ID");
	String pltnum = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "House_No");
	String rms = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "Available_Rooms");
	String ownrnm = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet1", "tc_01", "ownrnme");
	String rname=name+randomnum;
	String uname=ownrnm+rname;
	String emlid=rname+eml;
	
	String s2=jLib.getRandmblnum();

	
	//Random random = new Random();
	//String s1="";
	//for(int i=0;i<10;i++) {
		//int n = random.nextInt(10);

		//s1=s1+n;
	//}	

	//WebDriver driver=new ChromeDriver();
	//driver.get(URL);
	
	ApartmentListPage al=new ApartmentListPage(driver);
	IndvidualHomeRegstrPage hmereg=new IndvidualHomeRegstrPage(driver);
	AdminHome hme=new AdminHome(driver);

System.out.println(rname);
System.out.println(rent);

	hme.getRgstrlink().click();
	hmereg.getNametxtbx().sendKeys(rname);
	hmereg.getMblnumtxtbx().sendKeys(s2);
	hmereg.getAltmblnumtxtbx().sendKeys(altmbnum);
	//hmereg.getEmltxtbx().sendKeys(rname+"@gmail.com");
	hmereg.getEmltxtbx().sendKeys(emlid);
//Assert.fail();
	hmereg.getPltnumtxtbx().sendKeys(pltnum);
	hmereg.getRoomstxtbx().sendKeys(rms);
	hmereg.getCntrytxtbx().sendKeys(countryName);
	hmereg.getSttxtbx().sendKeys(stateName);
	hmereg.getCtytxtbx().sendKeys(cityName);
	hmereg.getRnttxtbx().sendKeys("rent");
	hmereg.getDpsttxtbx().sendKeys(dpst);
	hmereg.getAccmdtntxtbx().sendKeys(accmdtn);
	hmereg.getDsectxtbx().sendKeys(desc);
	hmereg.getLndmrktxtbx().sendKeys(lndmrk);
	hmereg.getAdrstxtbx().sendKeys(addrs);
	WebElement v = hmereg.getVcnttxtbx();
	Select s=new Select(v);
	s.selectByValue("1");
	File f=new File("C:\\Users\\SHREE\\Pictures\\example image\\Screenshot (397).png");
	String addr=f.getAbsolutePath();
	hmereg.getImgtxtbx().sendKeys(addr);
	Thread.sleep(3000);
	hmereg.getSbmtbtn().click();
	Thread.sleep(2000);
	String expectedtext=expctdtest;
	String actualtext=hmereg.getMsg().getText();
	if(actualtext.equals(expectedtext))
	{
		System.out.println("registration successfull");
	}
	else
	{
		System.out.println("registration not successful");
	}

	hme.getDetailslnk().click();
	String value = al.test(driver, rname);

	
	if(value.equals(uname))
	{
	System.out.println("newly registered apartment is present");

	}
	else
	{
		System.out.println("newly registered apartment is not present");

		}
			}
}
