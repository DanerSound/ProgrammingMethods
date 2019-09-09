package oldText.Novembre18PI;

public class RebootVisitor extends Visitor {

	@Override
	public void resetNumber(Item item) {
		System.out.println(" HO VISITATO UN NUMBER");

	}

	@Override
	public void resetText(Item item) {
		System.out.println(" HO VISITATO UN TEXT ");

	}

	@Override
	public void resetTwice(Item item) {
		System.out.println(" HO VISITATO UN TWICE ");

	}

}
