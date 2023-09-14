package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesinArray {

	
	    public static void main(String[] args) {
	        int[] arr = { 1, 2, 3, 2, 4, 3,5, 6, 4,3};
	        
	     

	        // Call the printDuplicates method
	       // printDuplicates(arr);
	        
	        //using collection
	        printDuplicate(arr);
	        
	        //using single loop
	        //printDuplicatesSingleloop(arr);
	    }

	    //O(n2)
	    public static void printDuplicates(int[] arr) {
	        System.out.print("Duplicate Values in the Array: ");
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    // Found a duplicate element
	                    System.out.print(arr[i] + " ");
	                    break; // Exit the inner loop after printing the duplicate
	                }
	            }
	        }
	    }
	    
	    
	    //using single loop -> O(n)
	    public static void printDuplicatesSingleloop(int[] arr) {
	        System.out.print("Duplicate Values in the Array: ");
	        
	        Arrays.sort(arr);
	        for (int i = 1; i < arr.length; i++) {
	           
	                if (arr[i-1] == arr[i]) {
	                    // Found a duplicate element
	                    System.out.print(arr[i] + " ");
	                    
	                }
	            }
	        
	    }
	    
	    
	    //using collections
	    public static void printDuplicate(int[] arr)
	    {
	    	Set<Integer> mySet=new HashSet<>();
	    	Set<Integer> duplicates=new HashSet<>();
	    	for(int i:arr)
	    	{
	    		if(!mySet.contains(i))
	    		{
	    			mySet.add(i);
	    			
	    		}else {
	    			duplicates.add(i);
	    		}
	    	}
	    	
	    for(int j:duplicates)
	    {
	    	System.out.println(j);
	    }
	    	
	    }
	

}
