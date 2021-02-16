package oldText.myLuglio19;

public class DEMOflight {

	public static void main(String[] args) {
		Flight f1 = new Flight("A1", 10, "delay");
		Flight f2 = new Flight("A2", 7, "Departure");
		Flight f3 = new Flight("A3", 8, "Departure");

		Monitor m = new Monitor();

		m.attach(f1);
		m.attach(f2);
		m.attach(f3);

		m.printCurrent();

		f1.setGate(9);
		
	//	m.printCurrent();

	}

}
