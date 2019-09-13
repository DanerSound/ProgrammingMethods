package oldText.Luglio19;

public class Flight extends AbstractSubj<FlightAlert> {

	private String id;
	private int gate;
	private String state;

	public Flight(String id, int gate, String state) {
		this.id = id;
		this.gate = gate;
		this.state = state;
	}

	@Override
	public void notifyState(String flightId, String state, int gate) {
		for (int index = 0; index < getFlightList().size(); index++) {
			getFlightList().get(index).updateState(flightId, state, gate);
		}
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setState(String newState) {
		this.state = newState;
		notifyState(id, newState, gate);

	}

	public void setGate(int newGate) {
		this.gate = newGate;
		notifyState(id, state, newGate);

	}

	public String getState() {
		return state;
	}

	public int getGate() {
		return gate;
	}

	public String getId() {
		return id;
	}

}
