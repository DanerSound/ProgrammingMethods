package designpattern.Visitor;

public abstract class ComputerPartVistor {

	public abstract void visitComputer(ComputerPart computer);

	public abstract void visitMouse(ComputerPart mouse);

	public abstract void visitKeyboard(ComputerPart keyboard);

	public abstract void visitMonitor(ComputerPart monitor);

}
