package JavaProgramming;

import java.util.Scanner;

public class RelianceJio {

	public static void main(String[] args) {
		 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string");
		String input=sc.next();
		System.out.println(input.length());
		int count=0;
		int occu = 1;
		char ch= input.charAt(0);
		
		for(int i=1;i<input.length();i++)
		{
			if(ch==input.charAt(i)) {
				occu++;
				//System.out.println(i);
			}
			else if(ch!=input.charAt(i) && occu>1)
			{
				count++;
				ch=input.charAt(i);
				occu=1;
				//System.out.println(i);
			}
			else {
				occu=1;
				ch=input.charAt(i);
				//System.out.println(i);
			}
			
		}
		
  System.out.println(count);

	}

}
