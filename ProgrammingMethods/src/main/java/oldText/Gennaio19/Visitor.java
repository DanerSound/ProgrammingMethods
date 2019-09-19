package oldText.Gennaio19;

public abstract class Visitor {

	public abstract boolean visit(IntPair i);

	public abstract boolean visit(StrPair s);

	public abstract boolean visit(DoublePair d);

}
