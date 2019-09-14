package oldText.Febbraio19;

public class LocationSale extends AbstractLocationSale{

	private Location loc;
	private double baseAmount;

	public LocationSale(Location loc, double baseAmount) {
		this.loc = loc;
		this.baseAmount = baseAmount;
	}

	public double getTotalAmount() {
		double taxes = 0;
		// taxes = // do something
		return baseAmount+taxes;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
