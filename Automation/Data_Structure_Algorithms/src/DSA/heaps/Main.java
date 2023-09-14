package DSA.heaps;

public class Main {

	public static void main(String[] args) {
		
		Heap hp=new Heap();
		
		hp.insert(99);
		hp.insert(72);
		hp.insert(61);
		hp.insert(58);
		
		System.out.println(hp.getHeap());
		
		hp.insert(100);
		
		System.out.println(hp.getHeap());
		
		hp.insert(75);
		
		System.out.println(hp.getHeap());
		
	/*
	 * Expected output
	 * [99, 72, 61, 58]
	 * [100,99,61,58,72]
	 * [100,99,75,58,72,61]
	 * 
	 */

		hp.remove();
		
		System.out.println(hp.getHeap());
		
		hp.remove();
		
		System.out.println(hp.getHeap());
	}

}
