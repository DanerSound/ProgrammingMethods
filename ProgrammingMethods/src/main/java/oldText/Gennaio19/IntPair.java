package oldText.Gennaio19;

public class IntPair<T> extends Pair<T> {

	public IntPair(T first, T snd) {
		super(first, snd);
	}

	@Override
	public String whatIs() {
		return this.toString();
	}

}
