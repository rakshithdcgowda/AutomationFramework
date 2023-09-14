package JavaProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Juno {

	public static void main(String[] args) {
		
		
		//NonRepeataive("juno bank and app rakshith gowda RAKS");
		
		NonRepeataticechars("juno bank and app rakshith gowda RAKS");
	}
	
	public static void NonRepeataive(String str1)
	{

		 String str=str1.toLowerCase();
	      char[] arr= str.toCharArray();
	      
	      Set<Character> Nonrepetativeset=new HashSet<>();
	      List<Character> NonrepeatativeList=new ArrayList<>();
	      for(char c:arr)
	      {
	    	 if(!Nonrepetativeset.contains(c))
	    	 {
	    		 NonrepeatativeList.add(c);
	    		 Nonrepetativeset.add(c);
	    	 }
	    	 else {
	    		 NonrepeatativeList.remove((Character)c);
	    	 }
	      }
	      
	      for(char ch:NonrepeatativeList)
	      {
	    	  System.out.println(ch);
	      }
	  	        
}
	
	public static void NonRepeataticechars(String str)
	{
		String str1=str.toLowerCase();
		char[] arr=str1.toCharArray();
		
		Arrays.sort(arr);
		
		boolean[] bl=new boolean[arr.length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				bl[i]=true;
				bl[i+1]=true;
			}
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(!bl[j])
			{
				System.out.println(arr[j]+ " ");
			}
		}
		
		
		
		
		
		
	}
}
