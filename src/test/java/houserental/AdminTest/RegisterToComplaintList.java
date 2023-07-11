package houserental.AdminTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.houserental.pom.AdminHome;
import com.houserental.pom.ApartmentListPage;
import com.houserental.pom.ComplaintListDetailsPage;
import com.houserental.pom.ComplaintListPage;
import com.houserental.pom.IndvidualHomeRegstrPage;
import com.houserental.pom.LoginPage;
import com.houserental.pom.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterToComplaintList {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis=new FileInputStream("./data/commondata1.property");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		
		Random ran=new Random();
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
			LoginPage lp=new LoginPage(driver);
			ApartmentListPage al=new ApartmentListPage(driver);
			IndvidualHomeRegstrPage hmereg=new IndvidualHomeRegstrPage(driver);
			AdminHome hme=new AdminHome(driver);
			ComplaintListPage cl=new ComplaintListPage(driver);
			ComplaintListDetailsPage cld=new ComplaintListDetailsPage(driver);


			lp.getEmailtxtbx().sendKeys(USERNAME);
			lp.getPwdtxtbx().sendKeys(PASSWORD);
			lp.getLgbtn().click();
			hme.getRgstrlink().click();
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
hmereg.getSbmtbtn().click();
String expectedtext="Registration successfull. Thank you";
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
//String uname="Owner Name: "+rname;
al.getCmplbtn().click();
Thread.sleep(1000);

cl.getPltnametbx().sendKeys("2222");
Thread.sleep(1000);
cl.getCmplnttbx().sendKeys("no power");
Thread.sleep(1000);

cl.getSubmitbtn().click();
Thread.sleep(1000);

hme.getCmplntlstlink().click();
Thread.sleep(1000);
String expectedinfo=2222+" "+"no power";
System.out.println(expectedinfo);

String info=cld.getCmplntinfo().getText();
System.out.println(info);
if(info.contains(expectedinfo))
{
	System.out.println("present");
}
else
{
	
	System.out.println("not present");
}
driver.close();

}
}
