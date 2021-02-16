package oldText.Settembre19;

public class Worker implements Employee{
	
	private String name;
	private int salary;
	
	public Worker(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int getFixCost() {
		return salary;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);	
	}

	@Override
	public void add(Employee emp) throws Exception {
		throw new Exception();
	}

	public int getSalary() {
		return salary;
	}

}
