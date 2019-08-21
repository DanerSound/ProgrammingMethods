package designpattern.Decorartor;

public class DecorartorDEMO {

	public static void main(String[] args) {
		
		VisualComponent line = new Line();
		
		VisualComponent decALine = new DecorartorA(line);
		
		VisualComponent decBLine = new DecorartorB(line);
		
		VisualComponent textDecorar = new DecorartorA(new Text());
		
		System.out.println("this is a simple Line");
		line.draw();
		
	//	System.out.println(" this is a decorarted Line with A");
		decALine.draw();
		
	//	System.out.println(" this is a decorarted Line with B");
		decBLine.draw();
		
		

	}

}
