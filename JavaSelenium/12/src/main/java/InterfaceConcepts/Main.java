package InterfaceConcepts;

interface demo
{
	void disp();
}
class tester implements demo
{

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	public void test()
	{
		System.out.println("Hi");
	}
}

public class Main {
   public static void main(String[] args)
   {
	   tester t1 = new tester();
	   t1.disp();
	   t1.test();
   }
}
