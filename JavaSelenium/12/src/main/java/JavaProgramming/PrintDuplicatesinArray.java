package JavaProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = Arrays.asList(10,28,87,10,20,76,28,80);
		
		Set st=new HashSet<>();
		
		lst.stream().filter(s->!st.add(s)).collect(Collectors.toSet()).forEach(s-> System.out.println(s));

	}

}
