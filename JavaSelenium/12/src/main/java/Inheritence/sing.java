package Inheritence;


class pare
{
	 int x=10;
}
 class chil extends pare
 {
	  int add(int y)
	 {
		 int res = x+y;
		 System.out.println(res);
		 return res;
	 }
 }




public class sing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		chil ch = new chil();
		int val = ch.add(5);
		System.out.println(val);
		System.out.println(ch.x);
		
	}

}
