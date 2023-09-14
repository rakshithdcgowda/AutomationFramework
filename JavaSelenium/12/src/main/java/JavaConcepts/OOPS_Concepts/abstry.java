package JavaConcepts.OOPS_Concepts;

public class abstry {

	public static void main(String[] args) {
		
		Iphone obj = new Iphone();
		Config(obj);
		Samsung obj1 = new Samsung();
		Config(obj1);
		
	}
		public static void Config(Phone p1)
		{
			p1.Config();
		}

	}


abstract class Phone
{
	public abstract void Config();
}
class Iphone extends Phone
{
	public void Config()
	{
		System.out.println("2GB , IOS");
	}
}
class Samsung extends Phone
{
	public void Config()
	{
		System.out.println("3GB , Lolipop");
	}
}
