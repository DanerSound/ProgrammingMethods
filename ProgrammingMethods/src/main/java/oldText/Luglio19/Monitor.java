package oldText.Luglio19;

public class Monitor extends FlightAlert {

	@Override
	public void update(Flight f) {
		System.out.println("volo"+f.getId()+","+f.getState()+","+f.getGate());
		
	}

}
