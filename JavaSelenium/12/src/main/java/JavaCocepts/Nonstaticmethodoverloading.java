package JavaCocepts;

//Method over loading is used to perform same operation with different type of inputs
public class Nonstaticmethodoverloading {
	void search(int qty)
	{
		System.out.println(qty);
	}
	void search(int qty, String product)
	{
		System.out.println(product+" and "+ qty);
	}
	void search(int qty, int price)
	{
		System.out.println(qty+" and  "+price);
	}
	public static void main(String[] args)
	{
		Nonstaticmethodoverloading mo=new Nonstaticmethodoverloading();
		mo.search(2);
		mo.search(4, 10);
		mo.search(10, "Clothes");
		
	}
	
	

}
