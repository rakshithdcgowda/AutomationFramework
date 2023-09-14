package JavaConcepts.OOPS_Concepts;

class sample2
{
	void test()
	{
		System.out.println("Hi");
	}
}
class demo2 extends sample2
{
	//In the case of method overloading even though if it is upcasting we will get overridden implementation, Subclass
	void test()
	{
		System.out.println("Rock");
		//super.test();
	}
	void rock()
	{
		System.out.println("HELLO");
	}
}


public class UpcastandDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sample2 s1 = new demo2();//upcasting
		s1.test();
		
		demo2 d1 = (demo2) s1;
		d1.rock();
		d1.test();
		
	}

}
