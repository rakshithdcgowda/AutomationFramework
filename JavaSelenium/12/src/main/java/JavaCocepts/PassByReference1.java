package JavaCocepts;

class PassByReference2
 {
	void testingjob() {
     System.out.println("Hey its testing job");
	}
	

}
class PassByReference1
 {
	 public static void main(String[] args)
	 {
		 PassByReference2 R1 = new PassByReference2();
		 candidate1.needjob(R1);
		 candidate2.needjob(R1);
		 
		 }
 }
 class candidate1
 {
	 static void needjob(PassByReference2 R2)
	 {
		 R2.testingjob();
	 }
 }
 class candidate2
 {
	 static void needjob(PassByReference2 R3)
	 {
		 R3.testingjob();
	 }
 }
