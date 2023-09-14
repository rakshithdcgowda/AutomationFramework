package JavaCocepts;

class Printer1 {
	
	public void print(Paper p)
	{
		p.settext("Hiiii");
	}

}

class Paper
{
	String text;
	public void settext(String t)
	{
		text = t;
	}
	public String gettext()
	{
		return text;
	}
}

class Printer
{
	public static void main(String[] args)
	{
		Paper p = new Paper();
		p.settext("Hellow World");
		System.out.println(p.gettext());
		Printer1 pr = new Printer1();
		pr.print(p);
		System.out.println(p.gettext());
	}
}
