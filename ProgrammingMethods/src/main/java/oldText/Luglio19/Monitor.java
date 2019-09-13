package oldText.Luglio19;

public class Monitor extends AbstractSubj<Flight> implements FlightAlert {

	@Override
	public void updateState(String flightId, String newstate, int newGate) {
		System.out.println(" E' stato aggiornato il volo:" + flightId + " al gate:" + newGate + " stato: " + newstate);
		
		printCurrent();
	}

	public void printCurrent() {
		System.out.println(" ");
		for (int index = 0; index < getFlightList().size(); index++) {
			System.out.println(" Il volo codice:" + getFlightList().get(index).getId() + " al gate:"
					+ getFlightList().get(index).getState() + " stato: " + getFlightList().get(index).getGate());
		}

	}

	@Override
	public void notifyState(String flightId, String state, int gate) {
		// TODO Auto-generated method stub
	}

}
