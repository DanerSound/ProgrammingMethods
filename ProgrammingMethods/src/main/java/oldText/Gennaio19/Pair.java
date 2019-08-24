package oldText.Gennaio19;

public class Pair<T> {
	private T first, snd;

	public Pair(T first, T snd) {
		this.first = first;
		this.snd = snd;
	}

	public Pair<T> getPair() {
		return this;
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

	public void whatIs() {
		System.out.println(getFirst() + " " + getSnd());
		if (getFirst().getClass().equals(Pair.class)) {
			Pair<T> elem = th
		}
	}

}