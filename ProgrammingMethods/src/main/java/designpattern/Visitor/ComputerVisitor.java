package designpattern.Visitor;

public class ComputerVisitor extends ComputerPartVistor {

	@Override
	public void visitComputer(ComputerPart computer) {
		System.out.println("this is concreate visist of pc");

	}

	@Override
	public void visitMouse(ComputerPart mouse) {
		System.out.println("this is concreate visist of mouse");
	}

	@Override
	public void visitKeyboard(ComputerPart keyboard) {
		System.out.println("this is concreate visist of keyboard");

	}

	@Override
	public void visitMonitor(ComputerPart monitor) {
		System.out.println("this is concreate visist of monitor");

	}

}
