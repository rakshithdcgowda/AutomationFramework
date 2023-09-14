package Programming;

import java.util.Arrays;

public class Rotate {
	
	
	 public static void rotate(int[] nums, int k) {
	        k = k % nums.length;
	 
	        // Reverse the first part
	        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	        }
	 
	        // Reverse the second part
	        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	        }
	 
	        // Reverse the whole array
	        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	        }
	    }
	 
	 public static void rotate1(int[] arr, int k)
	 {
		int i=0;
		int count=0;
		int ele=arr[0];
		
		while(count!=arr.length)
		{
			int idx=(k+i)%arr.length;
			int temp=arr[idx];
			arr[idx]=ele;
			i=idx;
			ele=temp;
			count++;
			
			
		}
		
		for(int it:arr)
		{
			System.out.print(it+" ");
		}
	 }

	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 4;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"
		
        rotate1(nums1,k1);
	}

}
