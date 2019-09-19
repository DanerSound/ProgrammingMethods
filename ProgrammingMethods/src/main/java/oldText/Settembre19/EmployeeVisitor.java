package oldText.Settembre19;

public class EmployeeVisitor implements Visitor {

	private int boundSal;

	public EmployeeVisitor(int overSalary) {
		this.boundSal = overSalary;
	}

	public int overSalary(int salary) {
		int counter = 0;
		if (salary > boundSal) {
			counter++;
		}
		return counter;
	}

	@Override
	public void visit(Worker worker) {
		System.out.println("Ho appena visitato worker");
		overSalary(worker.getSalary());

	}

	@Override
	public void visit(Advisor advisor) {
		System.out.println("Advisor: NON È PROVISTO ALCUN STIPENDIO ");

	}

	@Override
	public void visit(Partner partner) {

		int limit = partner.getGroup().size();

		System.out.println("Ho appena visitato partner");

	}

}
