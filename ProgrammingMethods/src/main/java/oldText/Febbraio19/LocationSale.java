package oldText.Febbraio19;

public class LocationSale extends AbstractLocationSale {

	private Location loc;
	private double baseAmount;

	public LocationSale(Location loc, double baseAmount) {
		this.loc = loc;
		this.baseAmount = baseAmount;
	}

	public double getTotalAmount() {
		double taxes = 0;
		// taxes = // do something
		return baseAmount + taxes;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;

		}
		if (this.getClass() != obj.getClass()) {
			return false;

		}
		if ((loc.getId() == ((Location) obj).getId()) && (loc.getValue() == ((Location) obj).getValue())) {
			return true;

		} else {

			return false;
		}
	}

}
