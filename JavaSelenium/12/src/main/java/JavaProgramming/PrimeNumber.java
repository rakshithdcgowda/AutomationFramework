package JavaProgramming;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int no=6;
		
		boolean flag=false;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(no+" It is prime number");
		}
		else
		{
			System.out.println(no+" It is not prime number");
		}

	}

}
