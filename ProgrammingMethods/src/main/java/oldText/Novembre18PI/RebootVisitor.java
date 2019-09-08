package oldText.Novembre18PI;

public class RebootVisitor extends Visitor {

	@Override
	public void resetNumber(Element item) {
		System.out.println(" HO VISITATO UN NUMBER");

	}

	@Override
	public void resetText(Element item) {
		System.out.println(" HO VISITATO UN TEXT ");

	}

	@Override
	public void resetTwice(Element item) {
		System.out.println(" HO VISITATO UN TWICE ");

	}

}
