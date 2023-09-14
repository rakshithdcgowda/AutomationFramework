package JavaConcepts.OOPS_Concepts;

class Animal
{
	void noise()
	{
		System.out.println("Making some noice");
	}
}
 class dog extends Animal
 {
	 void noise()
	 {
		 System.out.println("Bow bow");
		 super.noise();
	 }
 }
 class cat extends Animal
 {
	 void noise()
	 {
		 System.out.println("Meow meow");	
     }
 }

class stimu
{
	static void ansi(Animal a1)
	{
		a1.noise();
	}
}




public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d1 = new dog();
		cat c1 = new cat();
		stimu.ansi(d1);
		stimu.ansi(c1);

	}

}
