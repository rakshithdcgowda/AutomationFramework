package Programming;

import java.awt.geom.Area;
import java.util.Arrays;

public class FindMaxMinValArray {
	
	public static int[] findMaxMin(int[] arr)
    {
       
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum value is "+max+"\n"+"Minimun value is "+min);
        
        
        return new int[] {max,min};
    }

	public static void main(String[] args) {
		
		
		int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
       System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"
	}

}
