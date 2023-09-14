package JavaProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceword {

	public static void main(String[] args) {
	
		countwords();
		
		
		/*
		 * String str="Welcome to code decode and code decode Welcome you";
		 * 
		 * List<String> words = Arrays.asList(str.split(" "));
		 * 
		 * Map<String, Long> map =
		 * words.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * System.out.println(map);
		 */
		 
	}
	
	public static void countwords()
	{
        String str="Welcome to code decode and code decode Welcome you";
        
        String[] words = str.split(" ");
		
		//List<String> words = Arrays.asList(str.split(" "));
		
	//	int count=0;
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String word:words)
		{
			
			if(map.get(word)!=null)
			{
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
	}

}
