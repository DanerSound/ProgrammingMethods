package oldText.Gennaio19;

public class StrPairVisitor extends PairVisitor {

	@Override
	public boolean visitIntPair(IntPair<?> intPair) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitStrPair(StrPair<?> strPair) {
		String frist = (String) strPair.getFirst();
		String snd = (String) strPair.getFirst();

		if (frist.length() != snd.length()) {
			System.out.println(" StrPair: false ");
			return false;

		}
		System.out.println(" StrPair: true ");
		return true;

	}

	@Override
	public boolean visitDoublePair(DoublePair<?> doublePair) {
		// TODO Auto-generated method stub
		return false;
	}

}
