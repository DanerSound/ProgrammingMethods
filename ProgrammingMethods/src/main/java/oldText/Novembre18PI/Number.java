package oldText.Novembre18PI;

public class Number implements Element {

	private String name;
	private int value;

	public Number(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public void accept(Visitor v) {
		v.resetNumber(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
