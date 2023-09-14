package JavaProgramming;

public class Number1 {
	
	public static void main(String[] args)
	{
		//output:- 1 8 3 6 5 4 7 2 9
		
		int no=10;
		for(int i=1;i<=10;i=i+2)
		{
			System.out.print(i+" "+(no=no-2)+ " ");
		}
		
		
		
	}
}
