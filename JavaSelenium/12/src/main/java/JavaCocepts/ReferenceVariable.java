package JavaCocepts;

public class ReferenceVariable {
	
	int add()
	{
		int a=5;
		int b=6;
		int c=a*b;
		return c;
	}
	public static void main(String[] args)
	{
		ReferenceVariable d= new ReferenceVariable();
		int f = d.add();
		System.out.println(f);
		System.out.println(d);
	}

}
