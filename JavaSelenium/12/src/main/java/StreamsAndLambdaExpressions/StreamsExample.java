package StreamsAndLambdaExpressions;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StreamsExample {
	
	
	//@Test
	public void normalGetCount()

	{
		List<String> names= new ArrayList();
		names.add("Raghu");
		names.add("Loki");
		names.add("Ranga");
		names.add("Dinga");
		
		int count =0;
		//Get the count of started with R in list
		for(int i=0;i<names.size();i++)
		{
			String name =names.get(i);
			
			if(name.startsWith("R"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	//@Test
	public void Streamsexe()
	{
		List<String> names= new ArrayList();
		names.add("Raghu");
		names.add("Loki");
		names.add("Ranga");
		names.add("Dinga");
		
		names.stream().forEach(s->System.out.println(s));
		
	long count1 = names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(count1);
		
		//converting modified stream into list
		List<String> list1 = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		
	}
	//@Test
  public void Mapsexam()

  
  {
		List<String> names= new ArrayList();
		names.add("Raghu");
		names.add("Loki");
		names.add("Ranga");
		names.add("Dinga");
		
		Stream.of("Konga","Kongi","Manga","Mangi").filter(s->s.startsWith("K")).map(s-> s.toLowerCase())
		.forEach(s->System.out.println(s));
		
		List<String> names1 = Arrays.asList("Raghu","Abhishek","Ranganath","Shruthi","Malvika");
		
		//names1.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		int[] arr= {18,29,2,6,76,87,28};
		 List<int[]> array1 = Arrays.asList(arr);
		
		array1.stream().sorted().forEach(s->System.out.println(s));
		
		
		//merging 2 different streams
		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		
		//newstream.forEach(s->System.out.println(s));
		
		//check the value present in the list stream
		
		boolean falg = newstream.anyMatch(s->s.equalsIgnoreCase("Raghu"));
		
		Assert.assertTrue(falg);
	  
  }

@Test
public void streamsexample1()
{
	
	List<String> names= new ArrayList();
	names.add("Raghu");
	names.add("Loki");
	names.add("Ranga");
	names.add("Dinga");
	
	//Print the List
	names.stream().forEach(s->System.out.println(s));
	
	//Search that value is present in that collection
	boolean Flag = names.stream().anyMatch(s->s.equalsIgnoreCase("RaghU"));
	System.out.println(Flag);
	
	//Filter the List
	long cont = names.stream().filter(s->s.startsWith("L")).count();
	System.out.println(cont);
	
	//Modify the list values
	names.stream().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	
	//sorted the values
	names.stream().sorted().forEach(s->System.out.println(s));
	
	List<Integer> values = Arrays.asList(9,90,9,6,7,25,1,2,1,6,20);
	
	//to remove duplicates and sort the list
	List<Integer> values1 = values.stream().distinct().sorted().collect(Collectors.toList());
	values1.stream().forEach(s->System.out.println(s));
	
	int[] arr= {10,39,27,1,2,56,8,39,2,10,12,9};
	
	String[] str= {"Rohith","Ranga","Ravi","Lavu","Pooja","Ranga"};
	
	List<String> strarray = Arrays.asList(str);
	
	strarray.stream().distinct().sorted().forEach(s->System.out.println(s));
	
// List<Integer> arr1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
 
 List<Integer> aar1 = Arrays.stream(arr).distinct().sorted().boxed().collect(Collectors.toList());
	
 aar1.stream().forEach(s->System.out.println(s));
}


}
