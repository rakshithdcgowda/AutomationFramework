package JavaCocepts;

public class NonStaticWithReturntype {
	
	public static void main(String[] args)
	{
		NonStaticWithReturntype d= new NonStaticWithReturntype();
		int res1 = d.add(4);
	
		System.out.println(res1);
		
	}
	
	 int add(int a)
	{
		//int a = 5;
		int b= 6;
		int res = a*b;
		return res;
		
	}

}
