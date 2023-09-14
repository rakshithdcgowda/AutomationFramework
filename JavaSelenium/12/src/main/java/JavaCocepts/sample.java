package JavaCocepts;

public class sample {
	 String val1= "abc";
	static int x=5;
	static double val = 8.9;
	int add(int y)
	{
		int add = x+y;
		System.out.println(val1);
		return add;
	}
	
	public static void main(String[] args)
	{
		int res = new sample().add(4);
		System.out.println(res);
	}

}
