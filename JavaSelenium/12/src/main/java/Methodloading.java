
public class Methodloading {

	public static void main(String[] args) {
		
		send(3);
		send(5,"Rock");
		send(2,3);

	}
	
	public static void send(int msg)
	{
		System.out.println(msg);
	}
	public static void send(int msg, String str)
	{
		System.out.println(str+ " "+msg);
	}
	public static void send(int msg, int x)
	{
		System.out.println(msg);
	}
}
