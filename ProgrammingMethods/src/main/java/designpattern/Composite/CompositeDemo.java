package designpattern.Composite;

public class CompositeDemo {

	public static void main(String[] args) {
		Picture flatLine = new Picture();
		
		flatLine.add(new Line());
		flatLine.add(new Rectangle());
		flatLine.add(new Text());
		
		flatLine.draw();
		

	}

}
