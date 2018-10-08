package base;


public class Constant implements Exp{
	
	public int value;
	
	public Constant(int value) {
		super();
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int evalutation() {
		return value;
	}
}
