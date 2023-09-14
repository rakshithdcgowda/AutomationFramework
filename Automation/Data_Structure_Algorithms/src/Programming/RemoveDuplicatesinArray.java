package Programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinArray {
	
	//
	 public static int removeDuplicates(int[] nums)
	    {
	       if(nums.length==0)
	       {
	           return 0;
	       }
	       Arrays.sort(nums);
	       int i=1;
	       for(int j=1;j<nums.length;j++)
	       {
	           if(nums[j]!=nums[j-1])
	           {
	               nums[i]=nums[j];
	               i++;
	           }
	       }
	       
	       return i;
	    }
	 
	 //using collection
	 public static void removeDuplicate(int[] nums)
	 {
		 Set<Integer> mySet=new HashSet<>();
		 List<Integer> myList=new ArrayList<>();
		 
		 for(int i:nums)
		 {
			 if(!mySet.contains(i))
			 {
				 mySet.add(i);
				myList.add(i);
			 }
		 }
		 
		 System.out.println(myList);
		 System.out.println(mySet);
		 
	 }
	

	public static void main(String[] args) {
		
		 int[] nums1 = {0, 0, 1, 1, 1,5,4,3,8,5, 2, 2, 3, 3, 4};
	        int newLength1 = removeDuplicates(nums1);
	        System.out.println("Test case 1: New length: " + newLength1);
	        System.out.println("Test case 1: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

            removeDuplicate(nums1);
	}

}
