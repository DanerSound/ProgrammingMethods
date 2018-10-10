package base;


public class Costant implements Exp {
	
	public int value;
	
	public Costant(int value) {
		super();
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public int valutation() {
		return getValue();
	}
}
