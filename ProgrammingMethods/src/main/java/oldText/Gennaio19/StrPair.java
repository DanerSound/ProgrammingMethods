package oldText.Gennaio19;

public class StrPair<T> extends Pair<T>{

	public StrPair(T first, T snd) {
		super(first, snd);
	}

	@Override
	public String whatIs() {
		return this.toString();
	}
	
}
