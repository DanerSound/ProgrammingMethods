package designpattern.Visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerVisitor part) {
		part.visitMouse(this);
		
	}

}
