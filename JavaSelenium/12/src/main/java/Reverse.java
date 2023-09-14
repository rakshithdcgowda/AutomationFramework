
public class Reverse {

	public static void main(String[] args) {

		
		//input:- My name is XYZ
		//OUTPUT:- ZYX is name My
		
		String str="My name is XYZ";
		String[] arr = str.split(" ");
		String str1="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==arr.length-1)
			{
				String st=arr[i];
				String st1="";
				for(int j=st.length()-1;j>=0;j--)
				{
					st1=st1+st.charAt(j)+" ";
				}
				
				str1=str1+st1;
			}else {
			str1=str1+arr[i]+" ";
			}
		}
		System.out.println(str1);

	}

}
