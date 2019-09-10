package oldText.Gennaio19;

public class IntPairVisitor extends PairVisitor{

	@Override
	public boolean visitIntPair(IntPair<?> intPair) {
		if ((Integer) intPair.getFirst() < (Integer) intPair.getSnd()) {
			System.out.println(" IntPair: true ");
			return  true ;
		}
		System.out.println(" IntPair: flase ");
		return false;
	}

	@Override
	public boolean visitStrPair(StrPair<?> strPair) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitDoublePair(DoublePair<?> doublePair) {
		// TODO Auto-generated method stub
		return false;
	}

}
