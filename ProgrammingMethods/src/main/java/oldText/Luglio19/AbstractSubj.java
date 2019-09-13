package oldText.Luglio19;

import java.util.ArrayList;

public abstract class AbstractSubj<T>{
	
	private ArrayList<T> flightList = new ArrayList<>();
	
	public abstract void notifyState(String flightId, String state, int gate);
	
	public void attach( T a ) {
		flightList.add(a);
	}
	
	public void dettach( T a) {
		flightList.remove(a);
	}

	public ArrayList<T> getFlightList() {
		return flightList;
	}

	public void setFlightList(ArrayList<T> flightList) {
		this.flightList = flightList;
	}


	
}
