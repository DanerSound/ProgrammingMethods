package base;

public class Constant implements Exp{
	
	private int value=-1;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int evalutation() {
		return getValue();
	}
}
