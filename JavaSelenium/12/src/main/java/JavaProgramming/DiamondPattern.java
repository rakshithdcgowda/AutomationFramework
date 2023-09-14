package JavaProgramming;

public class DiamondPattern {

	public static void main(String[] args) {

		
		int space=2;
		int star=1;
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
		
		int space1=1;
		int star1=3;
	
		for(int a=1;a<=2;a++)
		{
			for(int b=1;b<=space1;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=star1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
			space1++;
			star1=star1-2;
		}
		
		

	}

}
