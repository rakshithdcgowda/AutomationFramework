package JavaConcepts.OOPS_Concepts;

public class CheckedException {
	
	
	
	 static void ride() throws OlaException
	{
		int Capa=5;
		if(Capa<=4)
		{
			System.out.println("Safe Journey");
		}
		else
		{
			throw new OlaException("Please book less than 4 capacity");
		}
	}

	public static void main(String[] args) {
		
		try
		{
			ride();
		}
		catch(OlaException e)
		{
			System.out.println(e.getMessage());
		}
		

	}
	class OlaException extends Exception
	{
		String Msg;
		OlaException(String Msg)
		{
			this.Msg=Msg;
		}
		public String getmsg()
		{
			return Msg;
		}
	}

}
