package oldText.Gennaio19;

public abstract class Pair<T> {

	private T first, snd;

	public Pair(T first, T snd) {
		this.first = first;
		this.snd = snd;
	}

	public abstract String whatIs();
	
	public abstract void acceptVisitor( PairVisitor visitor);
	
	@Override
	public String toString() {
		return first.getClass().toString()+ "  " + snd.getClass().toString();
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSnd() {
		return snd;
	}

	public void setSnd(T snd) {
		this.snd = snd;
	}

}
