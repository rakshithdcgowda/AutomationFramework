package JavaConcepts.OOPS_Concepts;


/*
 Encapsulation:- Declare the data member as private and restrict the direct access
 out side the class and provide the indirect access through public services called getters and setters is called encapsulation.
 */


public class Encapsulation {
	
	
	private int ATMPin= 123;
	
	public int getatmpin()
	{
		return ATMPin;
	}
	
	public void setatmpin(int atmpin)
	{
		this.ATMPin=atmpin;
	}

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getatmpin());
		obj.setatmpin(456);
		System.out.println(obj.getatmpin());
		
	}

}
