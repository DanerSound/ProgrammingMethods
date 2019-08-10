package designpatterns.Observer;


import java.util.ArrayList;

public abstract class AbstractSubj {
	
	private ArrayList<AbstractObs> obsList;

	public AbstractSubj() {
		obsList = new ArrayList<AbstractObs>();
	}
	
	public void attach (AbstractObs obs) {
		obsList.add(obs);	
	}
	
	public void dettach (AbstractObs obs) {
		obsList.remove(obs);
	}
	public void notifyObs(boolean state) {
		for (int index=0; index < obsList.size();index++ ) {
			obsList.get(index).update(state);
		}
		
	}
}
