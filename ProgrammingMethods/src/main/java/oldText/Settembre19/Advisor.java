package oldText.Settembre19;

public class Advisor implements Employee {

	private String name;

	public Advisor(String name) {
		this.name = name;
	}

	@Override
	public int getFixCost() {
		return 0;

	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

	@Override
	public void add(Employee emp) throws Exception {
		throw new Exception();

	}

}
