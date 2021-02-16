package oldText.Giugno19;

public class BookSale implements SaleStrategy {

	private Book book;
	private int perc;

	public BookSale(Book book, int perc) {
		this.book = book;
		this.perc = perc;
	}

	@Override
	public void discount() {
		double newprice = book.getPrice() - (book.getPrice() * perc) / 100;
		book.setPrice(newprice);
		
	}

}
