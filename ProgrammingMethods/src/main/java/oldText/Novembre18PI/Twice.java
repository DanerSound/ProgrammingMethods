package oldText.Novembre18PI;

public class Twice implements Element {

	private Element first;
	private Element snd;

	public Twice(Element first, Element snd) {
		this.first = first;
		this.snd = snd;
	}

	@Override
	public void accept(Visitor v) {
		v.resetTwice(this);

	}

	public Element getFirst() {
		return first;
	}

	public void setFirst(Element first) {
		this.first = first;
	}

	public Element getSnd() {
		return snd;
	}

	public void setSnd(Element snd) {
		this.snd = snd;
	}

}
