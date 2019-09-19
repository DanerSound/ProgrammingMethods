package oldText.Giugno19;

public class DEMOItem {

	public static void main(String[] args) throws Exception {
		
		Book b = new Book("A", 1990, 1);
		Book b2 = new Book("B", 1991, 2);
		Book b3 = new Book("C", 1992, 3);
		
		CD cd= new CD("A", 1);
		
		Package p = new Package(0);
		
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(cd);
		System.out.println(b.equals(b2));
		
		SalesContext bookSale = new SalesContext(new BookSale(b3, 1));
		bookSale.doDiscount();
		SalesContext bookSale1 = new SalesContext(new BookSale(b3, 1));
		bookSale1.doDiscount();
		
		System.out.println(b3.getPrice());
		
		SalesContext cdSale = new SalesContext(new CDsale(cd, 1));
		cdSale.doDiscount();
		
		
	
		
		
		
	}

}
