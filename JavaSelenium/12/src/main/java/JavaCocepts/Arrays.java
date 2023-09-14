package JavaCocepts;

public class Arrays {
	
	void withoutnewtype()
	{
		String arr[]= {"Raghu","Ranga","Ravi","Ramya"};
		int length= arr.length;
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void withnewtype()
	{
		char arr1[]=new char[5];
		arr1[0]='a';
		arr1[1]='b';
		arr1[2]='c';
		arr1[3]='d';
		arr1[4]='e';
		char arr2[]=arr1;
		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
	}
	
	public static void main(String[] args)
	{
		Arrays array= new Arrays();
		array.withoutnewtype();
		array.withnewtype();
	}

}
