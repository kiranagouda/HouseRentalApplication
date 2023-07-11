package houserental.AdminTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.houserental.genericutility.BaseClass;
import com.houserental.genericutility.ExcelUtlity;
import com.houserental.genericutility.FileUtlity;
import com.houserental.genericutility.JavaUtlity;
import com.houserental.pom.AdminHome;
import com.houserental.pom.ApartmentListPage;
import com.houserental.pom.IndvidualHomeRegstrPage;
import com.houserental.pom.LoginPage;
import com.houserental.pom.RoomsForRentApartmentListPage;
import com.houserental.pom.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterToRoomsForRent extends BaseClass {

	@Test(groups="regTest")
	public void RegstrToRmsfrrnt() throws Throwable
	{
		FileUtlity fi=new FileUtlity();
		 JavaUtlity jLib=new JavaUtlity();
		 ExcelUtlity eLib = new ExcelUtlity();

		    String TEST_SCRIPT_EXCEL_FILE_PATH =fi.getFilePathFromPropertiesFile("testScriptdatafilePath");

			/*FileInputStream fis=new FileInputStream("./data/commondata1.property");
			Properties p=new Properties();
			p.load(fis);
			String URL=p.getProperty("url");
			String USERNAME=p.getProperty("username");
			String PASSWORD=p.getProperty("password");*/
			
			/*Random ran=new Random();
			int randomnum=ran.nextInt(1000);
			
			String rname="rj"+randomnum;
			System.out.println(rname);
			
			
			String s1="";
			for(int i=0;i<10;i++) {
				int n = ran.nextInt(10);
			
				s1=s1+n;
			}	


		      WebDriverManager.chromedriver().setup();
		      WebDriver driver=new ChromeDriver();
		      driver.get(URL);
		      homepage hp=new homepage(driver);
				hp.getLoginlink().click();
				LoginPage lp=new LoginPage(driver);*/
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

				ApartmentListPage al=new ApartmentListPage(driver);
				IndvidualHomeRegstrPage hmereg=new IndvidualHomeRegstrPage(driver);
				AdminHome hme=new AdminHome(driver);  
				RoomsForRentApartmentListPage ral=new RoomsForRentApartmentListPage();
			/*	lp.getEmailtxtbx().sendKeys(USERNAME);
				lp.getPwdtxtbx().sendKeys(PASSWORD);
				lp.getLgbtn().click();*/
				String prevcount=hme.getRoomsfrrentlink().getText();

			/*	hme.getRgstrlink().click();
				hmereg.getNametxtbx().sendKeys(rname);
				hmereg.getMblnumtxtbx().sendKeys(s1);
				hmereg.getAltmblnumtxtbx().sendKeys("1555555555");
				hmereg.getEmltxtbx().sendKeys(rname+"@gmail.com");
				hmereg.getPltnumtxtbx().sendKeys("2222");
				hmereg.getRoomstxtbx().sendKeys("2bhk");
				hmereg.getCntrytxtbx().sendKeys("India");
				hmereg.getSttxtbx().sendKeys("karnataka");
				hmereg.getCtytxtbx().sendKeys("bangalore");
				hmereg.getRnttxtbx().sendKeys("rent");
				hmereg.getDpsttxtbx().sendKeys("18700");
				hmereg.getAccmdtntxtbx().sendKeys("hotwater");
				hmereg.getDsectxtbx().sendKeys("2bhk with hotwater facility");
				hmereg.getLndmrktxtbx().sendKeys("near postoffice");
				hmereg.getAdrstxtbx().sendKeys("6th main,6th cross");
				WebElement v = hmereg.getVcnttxtbx();
	Select s=new Select(v);
	s.selectByValue("1");
	File f=new File("C:\\Users\\SHREE\\Pictures\\example image\\Screenshot (397).png");
	String addr=f.getAbsolutePath();
	hmereg.getImgtxtbx().sendKeys(addr);
	Thread.sleep(3000);
	hmereg.getSbmtbtn().click(); */
	
	
	
	hme.getRgstrlink().click();
	hmereg.getNametxtbx().sendKeys(rname);
	hmereg.getMblnumtxtbx().sendKeys(s2);
	hmereg.getAltmblnumtxtbx().sendKeys(altmbnum);
	//hmereg.getEmltxtbx().sendKeys(rname+"@gmail.com");
	hmereg.getEmltxtbx().sendKeys(emlid);

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
	
	/* String expectedtext="Registration successfull. Thank you";
	String actualtext=hmereg.getMsg().getText();
	if(actualtext.equals(expectedtext))
	{
	System.out.println("registration successfull");

	}
	else
	{

	System.out.println("registration not successful");

	} */
	
	
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
	
	hme.getHomelink().click();
	hme.getRoomsfrrentlink().click();
	//String uname="Owner Name: "+rname;
	String actualuname = ral.verifyuname(driver, rname);

	if(actualuname.equals(uname))
	{
	System.out.println("newly registered room is present");
	}
	else
	{
		System.out.println("newly registered room is not present");

	}
	driver.close();
}
}
