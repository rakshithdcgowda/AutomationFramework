package InterviewPrograms;

public class DPWorld {

	public static void main(String[] args) {
		
		reverse();
		rak();
	}

/*
 * INPUT:- "this is a java class";
 * Output:- "ssal ca v ajas isiht"
 */
		public static void reverse()
		{
		 String inputString = "this is a java class";
	        // storing to temp string
	        String temp=inputString;

	        //reverse the word after removing space
	        StringBuilder reversedWord = new StringBuilder(inputString.replace(" ","")).reverse();

	        // taking new variable as finalOutput
	        String finalOutput="";

	        // i and j is two pointer, i pointing to reversedWord and j pointing to temp variable
	        // iterate reversedWord,
	        for (int i=0,j=0; i<reversedWord.length();i++,j++){
	            if(temp.charAt(j)==' '){
	                finalOutput=finalOutput+" ";
	                i--;
	            }else {
	                finalOutput=finalOutput+reversedWord.charAt(i);
	            }
	        }
	        System.out.println("finalOutput --> "+finalOutput);
	    }
		
		
		//my code
		public static void rak(){
	    	 
	    	 String str="this is a java class";
	    	 String str1=str.replace(" ", "");
	    	 String reverseStr="";
	    	 String finalOutput="";
	    	 for(int i=str1.length()-1;i>=0;i--)
	    	 {
	    		 reverseStr=reverseStr+str1.charAt(i);
	    	 }
	    	 
	    	 int count=0, start=0, end=0;
	    	 for(int j=0;j<str.length();j++)
	    	 {
	    		 count++;
	    		 if(str.charAt(j)==' ')
	    		 {
	    			 end=start+count;
	    			 finalOutput=finalOutput+reverseStr.substring(start, end-1)+" ";
	    			 //end=start+count;
	    			 start=start+count;
	    			 count=0;
	    		 }
	    	 }
	    	 System.out.println(finalOutput);
	    	 
	     }
	}

	



