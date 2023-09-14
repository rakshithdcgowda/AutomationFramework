package JavaProgramming;

public class Demo11 {

	public static void main(String[] args) {
		
		
		String str="shool";
		
		char[] arr = str.toCharArray();
		int count=0;
		//char ch='a';
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//ch=arr[i];
				}
			}
		}
		System.out.println("Repeatative character is " + " And count is "+count);

	}

}
