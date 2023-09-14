
public class Program {

	public static void main(String[] args) {
		
		//reverseStringwithsamelength();
		//reverse();
		rak();
		
	}
	
	public static void reverseStringwithsamelength()
	{
		
		String inputString = "this is a Java class";

			       char[] inputStringArray = inputString.toCharArray();
			         
			        char[] resultArray = new char[inputStringArray.length];
			         
			for (int i = 0; i < inputStringArray.length; i++) 
			        {
			            if (inputStringArray[i] == ' ') 
			            {
			                resultArray[i] = ' ';
			            }
			        }
			int j = resultArray.length-1;

			for (int i = 0; i < inputStringArray.length; i++)
			        {
			            if (inputStringArray[i] != ' ') 
			            {
			                //If resultArray already has space at index j then decrementing 'j'
			                 
			                if(resultArray[j] == ' ')
			                {
			                    j--;
			                }
			                 
			                resultArray[j] = inputStringArray[i];
			                j--;
			            }
			        }
			         
			        System.out.println(inputString+" ------>>> " +String.valueOf(resultArray));
			    }
			
     public static void reverse()
    {
    	 String inputString = "this is a java class";
         String[] words = inputString.split(" ");
         StringBuilder output = new StringBuilder();

         for (String word : words) {
             StringBuilder reversedWord = new StringBuilder(word.toLowerCase());
             reversedWord.reverse();
             output.append(reversedWord).append(" ");
         }
         System.out.println(output.toString().trim());
     }
     
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
