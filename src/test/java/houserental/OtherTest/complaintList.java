package houserental.OtherTest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class complaintList {

		public static void main(String[] arg) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(); 
			FileInputStream fis=new FileInputStream("./data/commondata.property");
			Properties p=new Properties();
			p.load(fis);
			String URL = p.getProperty("url");
			String USERNAME = p.getProperty("username");
			String PASSWORD = p.getProperty("password");
			driver.get(URL);
			driver.findElement(By.xpath("//a[.='Login']")).click();               
			driver.findElement(By.id("exampleInputEmail1")).sendKeys(USERNAME);    
			driver.findElement(By.id("exampleInputPassword1")).sendKeys(PASSWORD); 
			driver.findElement(By.xpath("//button[@type='submit']")).click();    
			driver.findElement(By.linkText("Details/Update")).click();
			driver.findElement(By.linkText("Complaint")).click();
			String name="rj";
			String complaint="water issue";
			String expmsg="Sent Successfully";
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("cmp")).sendKeys(complaint);
			driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		 String actmsg = driver.findElement(By.xpath("//div[.='Sent Successfully']")).getText();
		System.out.println(actmsg);
		if(expmsg.equals(actmsg)) {
		System.out.println("complaint sent successfully");
		}
		else
		System.out.println("complaint not sent successfully" );
		driver.findElement(By.linkText("Complaint List")).click();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		String table = driver.findElement(By.xpath("//table")).getText();
		if(table.contains(complaint)) {
			System.out.println(complaint);
		}
		else
			System.out.println("No compaint displayed");
		
		driver.close();
		}
		
	}
	

	