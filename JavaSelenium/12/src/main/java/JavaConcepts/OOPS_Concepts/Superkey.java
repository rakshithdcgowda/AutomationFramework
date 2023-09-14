package JavaConcepts.OOPS_Concepts;



class insta
{
	void story()
	{
		System.out.println("iMAGE AND VIDEO");
	}
}

class insta_1 extends insta
{
	void add()
	{
		System.out.println("Adding emojis to story");
	}
	void story()
	{
		System.out.println("Adding songs and locations");
		super.story();
		//super key word is used for along with the sub class implementaion if we need super class implementation
	}
}


public class Superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insta_1 v1=new insta_1();
		v1.add();
		v1.story();
		
		
	}

}
