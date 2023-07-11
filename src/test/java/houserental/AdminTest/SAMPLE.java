package houserental.AdminTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SAMPLE {
public static void main(String[] args) {
	//welcome
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
}
}
