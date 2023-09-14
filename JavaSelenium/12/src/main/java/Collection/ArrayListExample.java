package Collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Hii");
		a.add("Testing");
		a.add(0, "Rock");
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.get(0));
		
		a.remove(0);
		
		System.out.println(a);
		
		System.out.println(a.contains("Testing"));
		
		a.removeAll(a);
		
		System.out.println(a.isEmpty());
		
		a.clear();
		
		System.out.println(a);
		

	}

}
