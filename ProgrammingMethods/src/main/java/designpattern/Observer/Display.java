package designpattern.Observer;

public class Display implements AbstractObs {
	
	boolean displayState;

	public void update(boolean subjetState) {
			displayState=subjetState;
			System.out.println("il display visualizza:"+subjetState);	
	}

}
