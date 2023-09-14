package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderexample {

	@Test(dataProvider="getData")
	public void sample(String UN, String Pwd)

	{
		System.out.println(UN);
		System.out.println(Pwd);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0]="FirstUserName";
		data[0][1]="FirstPwd";
		data[1][0]="SecondUserName";
		data[1][1]="SecondPWD";
		data[2][0]="ThirdUsername";
		data[2][1]="ThirdPwd";
		
		return data;
	}
	
	
	
}
