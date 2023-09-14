package JavaCocepts;

public class Constructorvav {
	
	int emplyeeID;
	char grade;
	String Company;
	
	Constructorvav(int x, char y, String z)
	{
		emplyeeID=x;
		grade=y;
		Company=z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorvav ch =new Constructorvav(21,'A',"Aptean");
		System.out.println("Employee Id  "+ch.emplyeeID);
		System.out.println("Employee grade  "+ch.grade);
		System.out.println("Employee company  "+ch.Company);
		System.out.println(ch.getClass());
		
		
	}

}
