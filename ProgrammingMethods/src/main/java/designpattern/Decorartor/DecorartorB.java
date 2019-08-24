package designpattern.Decorartor;

public class DecorartorB extends  Decorartor{
	
	boolean state;

	public DecorartorB(VisualComponent component) {
		super(component);
		state = false;
	}

	@Override
	public void draw() {
		System.out.println("thi is DECB i added first this print");
		super.draw();
		System.out.println("i added afeter this print: "+state);
	}
	
	
}
