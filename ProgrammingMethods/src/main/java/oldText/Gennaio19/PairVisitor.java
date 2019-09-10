package oldText.Gennaio19;

public abstract class PairVisitor {
	
	public abstract boolean visitIntPair( IntPair<?> intPair);
	
	public abstract boolean visitStrPair( StrPair<?> strPair);
	
	public abstract boolean visitDoublePair( DoublePair<?> doublePair);
}
