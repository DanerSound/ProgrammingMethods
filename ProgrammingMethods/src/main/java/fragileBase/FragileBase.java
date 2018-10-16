package fragileBase;

public class FragileBase {

	public static void main(String[] args) {
		
		BaseClass m= new BaseClass();
		m.printClassName();
		
		BaseClass d = new DaughterClass();
		d.printClassName();

	}

}
