import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Duplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,78,90,10,56,20,56};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
		
	}

}
