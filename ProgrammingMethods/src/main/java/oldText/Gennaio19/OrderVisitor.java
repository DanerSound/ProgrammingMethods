package oldText.Gennaio19;

public class OrderVisitor extends Visitor {

	@Override
	public boolean visit(IntPair i) {
		if (i.getFirst() < i.getSnd()) {
			System.out.println(" la pair data è ben ordinata");
			return true;
		} else {
			System.out.println("La pair non è ordinata");
			return false;
		}

	}

	@Override
	public boolean visit(StrPair s) {
		if (s.getFirst().length() < s.getSnd().length()) {
			System.out.println(" La pair Stringhe è ben ordinata");
			return true;
		} else {
			System.out.println(" La pair Stringhe non è ben ordinata");
			return false;
		}

	}

	@Override
	public boolean visit(DoublePair d) {

		System.out.println("non so come si fa questo ");
		return false;
	}

}
