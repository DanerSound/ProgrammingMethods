package designpattern.Visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerVisitor part) {
		part.visitKeyboard(this);

	}

}
