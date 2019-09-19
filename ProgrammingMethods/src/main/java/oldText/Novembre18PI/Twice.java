package oldText.Novembre18PI;

public class Twice implements Item {

	private Item first;
	private Item snd;

	public Twice(Item first, Item snd) {
		this.first = first;
		this.snd = snd;
	}

	@Override
	public void accept(RebootVisitor v) {
		v.visit(this);

	}

	@Override
	public boolean equals(Object obj) {
		Twice current = (Twice) obj;

		if ((first == current.first) && (snd == current.snd)) {
			return true;
		} else {
			return false;
		}

	}

	public Item getFirst() {
		return first;
	}

	public void setFirst(Item first) {
		this.first = first;
	}

	public Item getSnd() {
		return snd;
	}

	public void setSnd(Item snd) {
		this.snd = snd;
	}

}
