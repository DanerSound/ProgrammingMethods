package oldText.Giugno19;

public class Book extends Item {

	private String title;
	private int year;
	private double price;

	public Book(String title, int year, double price) {
		this.title = title;
		this.year = year;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void add(Item i) throws Exception {
		// Exception("");

	}

	@Override
	public boolean equals(Object obj) {
		if (this.title == ((CD) obj).getTitle()) {
			return true;
		}
		return false;
	}

	public void setPrice(double newprice) {
		this.price = newprice;

	}

	public String getTitle() {
		return title;
	}

}
