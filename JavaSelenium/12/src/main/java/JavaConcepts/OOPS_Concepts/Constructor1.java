package JavaConcepts.OOPS_Concepts;

public class Constructor1 {
	
	int c=5;
	
	Constructor1(int a, int b)
	{
		int add=a+b+c;
		System.out.println(add);
		
		
	}
	public static void main(String[] args)
	{
		Constructor1 d = new Constructor1(3,5);
		//System.out.println(d.add);
		
	}

}
