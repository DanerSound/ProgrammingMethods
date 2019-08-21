package designpattern.Visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerVisitor part) {
		part.visitMonitor(this);

	}

}
