package designpatterns.Observer;

public class ObserverMain {

	public static void main(String[] args) {
		PushButton button = new PushButton(true); //  subject
		
		Display segmentsDisplay = new Display(); // observer1
		
		Display lcdDisplay = new Display();
		
		button.attach(segmentsDisplay);
		button.attach(lcdDisplay);
		
		button.pushedButton(false);
		button.pushedButton(true);
		button.pushedButton(false);
		button.pushedButton(true);
		button.pushedButton(false);
		button.pushedButton(true);
		
	}

}
