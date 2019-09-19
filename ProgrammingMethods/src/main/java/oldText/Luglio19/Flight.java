package oldText.Luglio19;

import java.util.ArrayList;

public class Flight {

	private String id;
	private String state;
	private int gate;
	private ArrayList<FlightAlert> obs;

	public Flight(String id, String state, int gate) {
		super();
		this.id = id;
		this.state = state;
		this.gate = gate;
		this.obs = new ArrayList<>();
	}

	public void attach(FlightAlert f) {
		obs.add(f);
	}

	public void remove(FlightAlert f) {
		obs.remove(f);
	}

	public void updateState(String newState) {
		setState(newState);
		notifyObservers();
	}

	public void updateGate(int newGate) {
		setGate(newGate);
		notifyObservers();
	}

	public void notifyObservers() {
		for (int index = 0; index < obs.size(); index++) {
			obs.get(index).update(this);
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getGate() {
		return gate;
	}

	public void setGate(int gate) {
		this.gate = gate;
	}

	public ArrayList<FlightAlert> getObs() {
		return obs;
	}

	public void setObs(ArrayList<FlightAlert> obs) {
		this.obs = obs;
	}

}
