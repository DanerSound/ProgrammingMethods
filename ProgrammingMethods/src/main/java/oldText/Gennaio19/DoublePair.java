package oldText.Gennaio19;

public class DoublePair<T extends Pair> extends Pair<T> {

	public DoublePair(T first, T snd) {
		super(first, snd);		
	}

	@Override
	public String whatIs() {
		return this.toString();
	}

}
