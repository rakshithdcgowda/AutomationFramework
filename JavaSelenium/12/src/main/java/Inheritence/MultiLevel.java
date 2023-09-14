package Inheritence;




class paren1
{
	int x=10;
}
class chil1 extends paren1
{
	void sim()
	{
		System.out.println("Hey I am sub class of parent");
	}
}
class child1 extends chil1 
{
	void cim()
	{
		System.out.println("Hey I am sub class of Child");
	}
}



public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		child1 ch = new child1();
		System.out.println(ch.x);
		ch.cim();
		ch.sim();

	}

}
