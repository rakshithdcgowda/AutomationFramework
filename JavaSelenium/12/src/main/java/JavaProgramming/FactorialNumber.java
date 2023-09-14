package JavaProgramming;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		for(int j=1;j<=10;j++)
		{
		int fact=1;
		 
		for(int i=1;i<=j;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial number of "+j+" is "+fact);
		}

	}

}
