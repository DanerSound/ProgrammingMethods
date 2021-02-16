package oldText.Febbraio19;

public class LocationDEMO {

	public static void main(String[] args) {
		Location l1 = new Location("firenze", 1);
		Location l2 = new Location("firenze", 2);
		
		LocationSale sale = new LocationSale(l1, 500);
		
		System.out.println(sale.equals(l2));

	}

}
