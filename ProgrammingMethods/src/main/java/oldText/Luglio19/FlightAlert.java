package oldText.Luglio19;

public abstract class FlightAlert {

	public abstract void update(Flight f);
	
	public void add(Flight f) {
		f.attach(this);
	}
	
	public void remove(Flight f) {
		f.remove(this);
	}

}
