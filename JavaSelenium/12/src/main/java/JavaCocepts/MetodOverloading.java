package JavaCocepts;

 class MetodOverloading {
	
	static void add(int i)
	{
		System.out.println(i);
	}
	static void add(int i, int j)
	{
		System.out.println(i+j);
	}
	static void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}

	public static void main(String[] args)
	{
		MetodOverloading.add(1);
		MetodOverloading.add(2, 4);
		MetodOverloading.add(5, 4, 6);
	}
}
