package InterviewCoding;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] arr= {89,12,110,7,12,8};
		
		int no=arr.length;
		
		for(int i=0;i<no;i++)
		{
			for(int j=1;j<no-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<no;k++)
		{
			System.out.println(arr[k]);
		}
		
		
		
		
	}

}
