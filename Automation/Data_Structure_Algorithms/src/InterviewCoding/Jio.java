package InterviewCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Jio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		String str=sc.next();
		int count=0;
				
		char[] arr=str.toCharArray();
		//Arrays.sort(arr);
		//int occr=0;
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2])
			{
				count++;
			}else if (arr[i]==arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
