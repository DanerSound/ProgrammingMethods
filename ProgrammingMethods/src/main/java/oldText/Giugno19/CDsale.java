package oldText.Giugno19;

public class CDsale implements SaleStrategy {

	private CD cd;
	private int perc;

	public CDsale(CD cd, int perc) {
		this.cd = cd;
		this.perc = perc;
	}

	@Override
	public void discount() {
		double newprice = cd.getPrice() - (cd.getPrice() * perc) / 100;
		cd.setPrice(newprice);

	}

}
