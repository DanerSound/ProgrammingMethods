package oldText.Novembre18PI;

public class ItemResetDEMO {

	public static void main(String[] args) {

		Item number = new Number("DIO", 42);

		Item text = new Text(0, "porco");

		Item item = new Twice(number, text);

		RebootVisitor reset = new RebootVisitor();

		number.accept(reset);

		text.accept(reset);

		item.accept(reset);
		
		System.out.println(item.itemEquals(item));
		System.out.println(number.itemEquals(text));
		System.out.println(text.itemEquals(text));

	}

}
