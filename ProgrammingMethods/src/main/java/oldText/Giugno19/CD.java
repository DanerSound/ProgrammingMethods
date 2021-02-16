package oldText.Giugno19;

public class CD extends Item {
	
	private String title;
	private double price;
	

	public CD(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void add(Item i) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this.title == ((Book)obj).getTitle()) {
			return true;
		}
		return false;
	}

	public void setPrice(double newprice) {
		this.price=newprice;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
