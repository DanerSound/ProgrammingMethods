package designpattern.Visitor;

public class VisitorDEMO {

	public static void main(String[] args) {
		ComputerPart pc = new Computer();
		pc.accept(new ComputerVisitor());

	}

}
