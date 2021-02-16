package oldText.Novembre18PI;

public class RebootVisitor extends Visitor {

	private String restString;

	public RebootVisitor(String restString) {
		this.restString = restString;
	}

//	private void reset(String r) {
//		if (r == restString) {
//
//		}
//
//	}

	@Override
	void visit(Number number) {
		if (number.getName() == restString) {
			number.setValue(0);
		}

	}

	@Override
	void visit(Text text) {
		System.out.println("Non ci sono numeri da azzerare");

	}

	@Override
	void visit(Twice twice) {
		// TODO : do somthing

	}

}
