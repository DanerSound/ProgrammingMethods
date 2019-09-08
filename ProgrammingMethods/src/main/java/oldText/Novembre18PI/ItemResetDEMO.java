package oldText.Novembre18PI;

public class ItemResetDEMO {

	public static void main(String[] args) {

		Element number = new Number("DIO", 42);

		Element text = new Text(0, "porco");

		Element item = new Twice(number, text);

		RebootVisitor reset = new RebootVisitor();

		number.accept(reset);

		text.accept(reset);

		item.accept(reset);

	}

}
