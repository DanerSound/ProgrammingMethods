package designpattern.AbstractFactory;

public class WindowsOS implements AbstractFactory{

	public YWindow createYellowWindow() {	
		return new YellowWindowWin();
	}

	public GWindow createGreenWindow() {
		return new GreenWindowWin();
	}

}
