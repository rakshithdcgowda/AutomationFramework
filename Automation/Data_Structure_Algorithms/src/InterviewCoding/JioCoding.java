package InterviewCoding;
import java.util.HashSet;
import java.util.Set;

public class JioCoding {

	public static void main(String[] args) {
		
		//This program count the distinct characters in a string
		
		        String input = "AABCDDDSKEE";
		        int distinctCount = countDistinctCharacters(input);
		        System.out.println("Distinct character count: " + distinctCount);
		    }

		    public static int countDistinctCharacters(String input) {
		        // Create a Set to store distinct characters
		        Set<Character> distinctCharacters = new HashSet<>();

		        // Convert the input string to an array of characters
		        char[] characters = input.toCharArray();

		        // Iterate through the characters and add them to the set
		        for (char c : characters) {
		            distinctCharacters.add(c);
		        }

		        // Return the size of the set, which is the count of distinct characters
		        return distinctCharacters.size();
		    }
		

	}


