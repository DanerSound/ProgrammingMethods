package designpatterns.AbstractFactory;

public class MacOS implements AbstractFactory {

	public YWindow createYellowWindow() {
		return new YelloWindowMac();
	
	}

	public GWindow createGreenWindow() {
		return new GreenWindowMac();
	}

}
