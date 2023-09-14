package JavaProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class Countwords {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string value");
		String str=sc.next();
		Countword(str);
		
		

	}
	
	public static void Countword(String str)
	{
		String[]  Str1=str.split(" ");
		HashMap<String, Integer> mp= new HashMap<String, Integer>();
		for(String st:Str1)
		{
			if(mp.get(st)!=null)
			{
				mp.put(st, mp.get(st)+1);
			}else {
				mp.put(st, 1);
			}
			
		}
		System.out.println(mp);
		
		
		
	}
	

}
