package JavaConcepts.OOPS_Concepts;

public class abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suresh obj = new Suresh();
		obj.call();
		obj.cook();
		obj.dance();

	}

}


 abstract class Mahesh
{
	public void call()
	{
		System.out.println("Calling...");
	}
	public abstract void dance();
	public abstract void cook();
	
}
 abstract class Ramesh extends Mahesh
 {
	 public void dance()
	 {
		 System.out.println("Dancing...");
	 }
	 public abstract void cook();
 }
 class Suresh extends Ramesh
 {
	 public void cook()
	 {
		 System.out.println("Cooking.....");
	 }
 }
