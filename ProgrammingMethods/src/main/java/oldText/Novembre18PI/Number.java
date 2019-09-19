package oldText.Novembre18PI;

public class Number implements Item {

	private String name;
	private int value;

	public Number(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public void accept(RebootVisitor v) {
		v.visit(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		if (value == ((Number)obj).value) {
//			return true;
//		} else {
			return false;
//		}
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
