package designpattern.Visitor;

public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer() {
		parts= new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor() };
	}

	@Override
	public void accept(ComputerVisitor part) {
		
		for(int index=0; index<parts.length;index++) {
			parts[index].accept(part);
		}
		
		part.visitComputer(this);
	}

}
