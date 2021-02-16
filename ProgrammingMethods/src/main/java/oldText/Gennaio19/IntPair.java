package oldText.Gennaio19;

public class IntPair extends Pair {

	private Integer first, snd;

	public IntPair(int first, int snd) {
		this.first = first;
		this.snd = snd;
	}

	@Override
	public String whatIs() {
		return first.getClass().toString() + " " + snd.getClass().toString();

	}

	@Override
	public void acceptVisitor(Visitor v) {

	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSnd() {
		return snd;
	}

	public void setSnd(int snd) {
		this.snd = snd;
	}

}
