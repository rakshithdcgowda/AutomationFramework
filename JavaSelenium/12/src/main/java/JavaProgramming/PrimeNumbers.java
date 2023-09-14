package JavaProgramming;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		for(int k=2;k<=100;k++)
		{
			boolean flag= false;
			
			for(int i=2;i<k;i++)
			{
				if(k%i==0)
				{
					flag=true;
					break;
				}
			}
			
			if(flag==false)
			{
				System.out.println("Prime numbers are  "+k);
			}
			else
			{
			//	System.out.println("It is not prime number "+k);
			}
			
			
			
			
			
			
		}
		
		
		
	}

}
