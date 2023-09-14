package JavaProgramming;

import java.util.HashMap;

public class DuplicateWords {
	
	static void dupicateWordsCount(String str)
	{
		
		
		String[] s = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for (String tempString : s) 
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}else {
			hm.put(tempString, 1);
			}
		}
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		
		dupicateWordsCount("I am learning java java effectively learning");
		
	}

}
