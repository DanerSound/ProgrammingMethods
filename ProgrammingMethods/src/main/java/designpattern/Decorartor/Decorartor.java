package designpattern.Decorartor;

public abstract class Decorartor implements VisualComponent {
	
	protected VisualComponent componentToDecorarte;
	
	public Decorartor(VisualComponent component) {
		this.componentToDecorarte=component;
	}
	
	@Override
	public void draw() {
		componentToDecorarte.draw();
	}
	
}
