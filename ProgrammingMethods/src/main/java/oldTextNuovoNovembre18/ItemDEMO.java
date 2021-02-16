package oldTextNuovoNovembre18;

public class ItemDEMO {

	public static void main(String[] args) {
		
		Number n = new Number("num",7);
		Number n2 = new Number("num",7);
		
		System.out.println(n.equals(n2));
		
		Text t = new Text(7, "campanelli");
		Text t2 = new Text(7, "campanell");
		
		System.out.println(t.equals(t2));
		
		Twice tw = new Twice(n, t);

	}

}
