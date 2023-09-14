package Inheritence;


class parent1
{
	int y=10;
}
class child2 extends parent1
{
	int z=10;
}
class child3 extends child2
{
	void jso()
	{
		System.out.println("Heyy");
	}
}
class child4 extends parent1
{
	void jo()
	{
		System.out.println("hoiii");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		child3 ch3=new child3();
		System.out.println(ch3.y+" value" +ch3.z);
		
		ch3.jso();
		
		child4 ch4=new child4();
		ch4.jo();

	}

}
