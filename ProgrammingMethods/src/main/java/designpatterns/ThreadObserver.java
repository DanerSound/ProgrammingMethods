package designpatterns;

public class ThreadObserver implements ThreadObserverInterface{

	public void update(boolean currentState) {
		System.out.println(" the current state of the thread is "+ currentState);
	
	}

}
