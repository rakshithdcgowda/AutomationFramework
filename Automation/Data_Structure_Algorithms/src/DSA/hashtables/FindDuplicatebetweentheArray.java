package DSA.hashtables;

import java.util.HashMap;

public class FindDuplicatebetweentheArray {

	public static void main(String[] args) {
		
		
		int[] arr= {2,3,4,5};
		int[] arr2= {10,12,13,5};
		
		
		System.out.println(duplicatevalues(arr, arr2));
	}
	
	public static boolean duplicatevalues(int[] arr,int[] arr2)
	{
		HashMap<Integer, Boolean> myHashmap=new HashMap<>();
		
		for(int i:arr)
		{
			myHashmap.put(i, true);
		}
		
		for(int j:arr2)
		{
			//Here we are verifying 2nd array value is present in the myHashmap or not, if it is present then it will go inside and return true.
			if(myHashmap.get(j)!=null)
			{
				return true;
			}
		}
		return false;
	}

}
