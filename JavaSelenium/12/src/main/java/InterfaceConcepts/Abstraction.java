package InterfaceConcepts;

/*Abstraction:- Hiding the Complexity of the System and exposing the required functionalites
to the End user is called as Abstraction
*Declare all the essentials properties in the interface and provide the implementation in the sub class
 Create reference variable for the interface type and initialize that reference variable with the 
 implementation class object this is how we can achieve Abstraction
 *Through interface we can achieve 100% Abstraction   
 
 
 
 */



interface Animal
{
	void noise();
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("Meow Meow");
	}
}
class Stim
{
	public static void ansi(Animal A1)
	{
		A1.noise();
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Stim.ansi(c1);
		Stim.ansi(d1);
		
	
       //new Stim().ansi(c1);
       //new Stim().ansi(d1);
	}

}
