package JavaConcepts.OOPS_Concepts;


class whatsapp
{
	void status()
	{
		System.out.println("Adding text");
	}
}

class whatsapp_1 extends whatsapp
{
	void add() {
		System.out.println("Adding new features like update profilr pic");
	}
	
	void status()
	{
		System.out.println("Adding text, image, videos");
		
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		whatsapp_1 v1= new whatsapp_1();
		v1.add();
		v1.status();
		
		
	}

}
