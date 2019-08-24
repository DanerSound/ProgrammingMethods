package designpattern.Decorartor;

public class DecorartorA extends Decorartor{
	
	public DecorartorA(VisualComponent component) {
		super(component);
	
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("this is DECA i add this print");
		
	}

}
