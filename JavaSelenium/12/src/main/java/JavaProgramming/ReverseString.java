package JavaProgramming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		String Str=sc.next();
		String value=" ";
		for(int i=Str.length()-1;i>=0;i--)
		{
			value=value+Str.charAt(i);
		}
		if(Str.equals(value))
		{
			System.out.println(value+" It is palindrome");
		}else
		{
			System.out.println(value+" It is not palindrome");
		}

	}

}
