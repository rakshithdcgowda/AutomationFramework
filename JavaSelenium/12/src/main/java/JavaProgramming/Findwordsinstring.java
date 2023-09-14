package JavaProgramming;

import java.util.Scanner;

public class Findwordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	Scanner sc= new Scanner(System.in);
		//System.out.println("Enter String value");
	//	String str = sc.next();
		
		String str = "   Java is n  using  for web  ";
		String[] str1=str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!="")
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
	}

}
