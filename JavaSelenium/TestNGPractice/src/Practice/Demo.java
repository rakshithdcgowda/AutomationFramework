package Practice;

import org.testng.annotations.Test;

public class Demo {
	
	
	//this method will execute after Homeloan method and personal loan
	@Test(dependsOnMethods= {"Homeloan"})
	public void carloan()
	{
		System.out.println("Car Loan");
	}
	
	
	//this method will wait till 40sec after that it will show error
	@Test(timeOut =4000)
	public void Homeloan()
	{
		System.out.println("Home Loan");
	}
	
	
	//It will skip the execution
	@Test(enabled=false)
	public void personalloan()
	{
		System.out.println("Personal Loan");
	}
	

}
