package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void carloan()
	{
		System.out.println("Car Loan");
	}
	
	@BeforeClass
	public void firstclass()
	{
		System.out.println("I am executing first in the class level");
	}
	
	@AfterClass
	public void lastclass()
	{
		System.out.println("I am executing last at the class level");
	}
	
	
	@BeforeTest
	public void testsuit()
	{
		System.out.println("I will execute first at the test leve in the xml");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		
		System.out.println("I will execute last after each and every method in the clas  level");
	}
	
	@Test(groups= {"smoke"})
	public void Homeloan()
	{
		System.out.println("Home Loan");
	}
	
	@AfterTest
	public void test()
	{
		System.out.println("I will execute last at the test level in the xml");
	}
	
	@Test
	public void personalloan()
	{
		System.out.println("Personal Loan");
	}
	

}
