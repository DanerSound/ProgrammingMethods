package oldText.Gennaio19;

public class DoublePairVisitor extends PairVisitor {
	
	@Override
	public boolean visitDoublePair(DoublePair<?> doublePair) {
		Pair first = (Pair)doublePair.getFirst();
		Pair snd = (Pair)doublePair.getSnd();
		
		//TODO: AGGIUNGI CONTROLLO PER VEDERE SE I CAZZO DI PAIR SONOR ORDINATI 
		System.out.println("Double Pair: porcodio");
		return false;
	}

	@Override
	public boolean visitIntPair(IntPair<?> intPair) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitStrPair(StrPair<?> strPair) {
		// TODO Auto-generated method stub
		return false;
	}



}
