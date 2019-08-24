package designpattern.Visitor;

public interface ComputerPart {
	
	public void accept(ComputerVisitor part);

}
