
class Rock
{
	public void send()
	{
		System.out.println("Message with number type");
	}
}
class Sample extends Rock
{
	public void send()
	{
		System.out.println("Message with numbers images ");
	}
}



public class Methodoverriding {

	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.send();

	}

}
