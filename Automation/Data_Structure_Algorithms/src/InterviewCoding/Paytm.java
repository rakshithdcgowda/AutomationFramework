package InterviewCoding;

public class Paytm {
	
	//input:- [1,2,3,4,5,6]
	//output:- [6,1,2,3,4,5]

	public static void main(String[] args) {
		
		        int[] inputArray = {1, 2, 3, 4, 5, 6};
		        
		        // Rotate the array to the right by one position
		        rotateArrayRight(inputArray);
		        
		        // Print the rotated array
		        for (int num : inputArray) {
		            System.out.print(num + " ");
		        }
		    }
		    
		    public static void rotateArrayRight(int[] arr) {
		        if (arr == null || arr.length <= 1) {
		            return; // Nothing to rotate
		        }
		        
		        int lastElement = arr[arr.length - 1];
		        
		        for (int i = arr.length - 1; i > 0; i--) {
		            arr[i] = arr[i - 1];
		        }
		        
		        arr[0] = lastElement;
		    }
		

	}


