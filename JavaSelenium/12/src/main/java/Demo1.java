import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
 String[] arr= { "auctioned","actors","altered","streaming","related","education","aspired","costar","despair","mastering"};
	 
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=i+1;j<arr.length;j++)
	 {
		 String str=arr[i];
		 String str2=arr[j];
		 if(str.length()==str2.length())
		 {
			 char[] tochar1 = str.toCharArray();
			 char[] tochar2 = str2.toCharArray();
			 
			 Arrays.sort(tochar1);
			 Arrays.sort(tochar2);
			 
			 if(Arrays.equals(tochar1, tochar2))
			 {
				 System.out.println("The given words are anagram "+arr[i]+", "+arr[j]);
			 }
			 
		 }
	 }
 }
		
	}

}
