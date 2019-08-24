package designpatterns.AbstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		WindowsOS win = new WindowsOS();
		MacOS mac = new MacOS();
		
		win.createGreenWindow().drawingGreenWindow();
		win.createYellowWindow().drawingYellowWindow();
		
		GWindow macWindg = mac.createGreenWindow();
		macWindg.drawingGreenWindow();
		
		YWindow macWindy = mac.createYellowWindow();
		macWindy.drawingYellowWindow();

	}

}
