package JavaConcepts.OOPS_Concepts;


class whatsapp1
{
	void text(int a)
	{
		System.out.println("Message is "+a);
	}
	void text(String b)
	{
		System.out.println("Message is "+b);
	}
	void text(char c, String d)
	{
		System.out.println("Message is "+c+" text "+d);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		whatsapp1 obj = new whatsapp1();
		obj.text(5);
		obj.text("Rock");
		obj.text('D', "Rakshi");

	}

}
