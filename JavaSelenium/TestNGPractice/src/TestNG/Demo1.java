package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(groups= {"smoke"})
	public void Hi()
	{
		System.out.println("Hi");
	}
	
	@BeforeSuite
	public void suitebefore()
	{
		System.out.println("I will execute first at the suite level in the xml");
	}
	
	@AfterSuite
	public void suiteafter()
	{
		System.out.println("I will exeute last at the suite level in the xml execution");
	}
	
	@Test(groups= {"smoke"})
	public void Hello()
	{
		System.out.println("Hello");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute first before each and every method in the class level");
	}
	
	@Test
	public void Come()
	{
		System.out.println("come");
	}

}
