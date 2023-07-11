package houserental.OtherTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demotng {
@BeforeSuite
public void bs()
{
	System.out.println("before suite"); 
}
@BeforeClass
public void bc()
{
	System.out.println("before class");
}
@BeforeTest
public void bt()
{
	System.out.println("before test");
}
@BeforeMethod
public void bm()
{
	System.out.println("before method");
}
@AfterSuite
public void as()
{
	System.out.println("after suite");
}
@AfterClass
public void ac()
{
	System.out.println("after class");
}
@AfterMethod
public void am()
{
	System.out.println("after method");
}
@AfterTest
public void at()
{
	System.out.println("after test");
}
@Test
public void display1()
{
	System.out.println("hi");
}
@Test
public void display2()
{
	System.out.println("hello");
}

}