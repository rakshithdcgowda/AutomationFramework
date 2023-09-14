package JavaProgramming;

import java.util.Arrays;

public class Anagram1 {
	
	
	public static void anagram(String string1, String string2)
	{
		String str= string1.replace(" ", "").toLowerCase();
		String str2=string2.replace(" ", "").toLowerCase();
		
		
		if(str.length()!=str2.length())
		{
			System.out.println("Its is not anagram");
		}else {
		
		char[] Array1 = str.toCharArray();
		char[] array2 = str2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array1);
		
		boolean Flag = Arrays.equals(Array1, array2);
		
		if(Flag==true)
		{
			System.out.println("It is ANaggram");
		}else {
			System.out.println("It not anagram");
		}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		anagram("aabbccdh","ababcdch");
		
		
	}

}
