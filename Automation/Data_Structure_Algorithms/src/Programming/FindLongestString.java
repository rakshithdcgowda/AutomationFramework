package Programming;

public class FindLongestString {
	
	//["apple",Banana", "kiwi", "POMOGRAINATE"]
	//POMOGRAINATE
	
	public static String findLongestString(String[] stringList)
    {
        int length=0;
        String str="";
        for(int i=0;i<stringList.length;i++)
        {
            if(length<stringList[i].length())
            {
                length=stringList[i].length();
                str=stringList[i];
            }
        }
        return str;
    }

	public static void main(String[] args) {
		
		String[] stringList1 = {"apple", "banana", "kiwi", "pear","pomograinate"};
        String longest1 = findLongestString(stringList1);
        System.out.println("Test case 1: Longest string: " + longest1);
		
	}

}
