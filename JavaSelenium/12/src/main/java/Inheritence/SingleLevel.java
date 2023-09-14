package Inheritence;
   

class parent
{
	static int x=19;
	int add(int z)
	{
		int add1 = x+z;
		System.out.println(add1);
		return add1;
	}
}
class child extends parent
{
	//int y = add(5);
	void mul()
	{
		int y = add(5);
		int res= x*y;
		System.out.println(res);
	}
}



public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child ch = new child();
		ch.add(4);
		System.out.println(parent.x);
		ch.mul();

	}

}
