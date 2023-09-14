package InterfaceConcepts;

public class IndiaSignal implements TrafficRules {

	public void redsignal() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Vehicle");
	}

	public void greensignal() {
		// TODO Auto-generated method stub
		System.out.println("Moving the vehicle");
		
	}

	public void yellowsignal() {
		// TODO Auto-generated method stub
		System.out.println("Ready to Move the vehicle");
	}
	public void ruleforsignal()
	{
		System.out.println("Rules should maintain in signal");
	}

}
