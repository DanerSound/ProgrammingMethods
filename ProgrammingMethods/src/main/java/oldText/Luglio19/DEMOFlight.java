package oldText.Luglio19;

public class DEMOFlight {

	public static void main(String[] args) {
		Flight f1 = new Flight("A", "ready", 1);
		Flight f2 = new Flight("B", "ready", 1);
		Flight f3 = new Flight("C", "ready", 1);
		
		Monitor m = new Monitor();
		m.add(f3);
		m.add(f2);
		m.add(f1);
		
	
	}

}
