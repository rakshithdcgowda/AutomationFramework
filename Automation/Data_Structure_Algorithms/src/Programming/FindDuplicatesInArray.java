package Programming;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		
		        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8,1,12};

		        findDuplicates(arr);
		    }

		    public static void findDuplicates(int[] arr) {
		        Set<Integer> seen = new HashSet<>();
		        Set<Integer> duplicates = new HashSet<>();

		        for (int num : arr) {
		            if (seen.contains(num)) {
		                duplicates.add(num);
		            } else {
		                seen.add(num);
		            }
		        }

		        if (duplicates.isEmpty()) {
		            System.out.println("No duplicates found.");
		        } else {
		            System.out.println("Duplicates found: " + duplicates);
		        }
		    }
		

	}


