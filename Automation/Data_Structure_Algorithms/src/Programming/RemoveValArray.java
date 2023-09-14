package Programming;

import java.util.ArrayList;
import java.util.List;

public class RemoveValArray {
	//[2,3,4,5,6,7,2,4,2] and val=2
	//Output= 6
	
	
	public static int removeElement(int[] arr, int val)
	{
		int i=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=val)
			{
				arr[i]=arr[j];
				i++;
			}
		}
		
		//removing the val form array and print 
		for(int j=0;j<i;j++)
		{
			System.out.println(arr[j]);
		}
		return i;
	
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,1,6,7,-2,0,9,2,4};
		int length=removeElement(arr, 2);
		System.out.println(length);
		

	}

}
