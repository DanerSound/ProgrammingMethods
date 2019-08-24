package designpattern.Observer;

public class PushButton extends AbstractSubj {
	
	boolean subjetState;

	public PushButton(boolean subjetState) {
		this.subjetState = subjetState;
	}
	
	public void  pushedButton(boolean newState) {
		setSubjetState(newState);
		notifyObs(newState);
	}

	public boolean isSubjetState() {
		return subjetState;
	}

	public void setSubjetState(boolean subjetState) {
		this.subjetState = subjetState;
	}
	
	
	
	

}
