package JavaCocepts;

public class typecasting {

	public static void main(String[] args) {
		
	// byte , short , int , long , float, double	
		
	int x=10;
	double y = x;
	System.out.println(y);
	
	int z = (int)y;
	System.out.println(z);
	
	float a = (float)y;
	System.out.println(a);
	
	
	
	type();

	}
	
	public static void type()
	{
		int x = 20;
		String Z = String.valueOf(x);
		System.out.println(Z);
		
		int q = Integer.parseInt(Z);
		System.out.println(q);
	}

}
