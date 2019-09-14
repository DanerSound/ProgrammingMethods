package oldText.Gennaio19;

public class VisitorStrPair implements Visitor {

	private StrPair strpair;

	public VisitorStrPair(StrPair strpair) {
		this.strpair = strpair;
	}

	@Override
	public boolean checkOrdStr() {
		if (strpair.getFirst().length() <= strpair.getSnd().length()) {
			System.out.println(" La Pair data è ben ordinata");
			return true;
		}
		System.out.println(" La pair data non è ben ordinata");
		return false;

	}

	@Override
	public boolean checkOrdInt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOrdDouble() {
		// TODO Auto-generated method stub
		return false;
	}

}
