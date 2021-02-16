package oldText.Giugno19;

public class SalesContext {
	
	private SaleStrategy toDiscount;

	public SalesContext(SaleStrategy toDiscount) {
		this.toDiscount = toDiscount;
	}
	
	public void doDiscount() {
		toDiscount.discount();
	}
	
	

}
