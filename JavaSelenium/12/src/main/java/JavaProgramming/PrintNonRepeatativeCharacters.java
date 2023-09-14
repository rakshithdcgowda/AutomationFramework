package JavaProgramming;

import java.util.Arrays;

public class PrintNonRepeatativeCharacters {

	public static void main(String[] args) {
		
		
		char arr[]= {'a','b','c','q','a','a','b','e','h'};
		Arrays.sort(arr);
		
		boolean[] b=new boolean[arr.length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				b[i]=true;
				b[i+1]=true;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(!b[i])
			{
				System.out.println(arr[i]+" ");
			}
		}

	}

}
