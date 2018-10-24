package designpatterns;

public class ThreadExchanger extends Thread{

	private boolean state;

	public ThreadExchanger(boolean state) {
		this.state=state;
	}
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	

	

}
