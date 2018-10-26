package designpatterns;


public class ThreadExchanger extends ThreadInterface{

	private boolean state;

	public ThreadExchanger(boolean state) {
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
		notifica();
	}

	@Override
	public void addObverser(ThreadObserver obs) {
		observers.add(obs);
	}

	@Override
	public void removeObser(ThreadObserver obs) {
		observers.remove(obs);
	}

	@Override
	public void notifica() {
		for (int index = 0; index < observers.size(); index++) {
			observers.get(index).update(isState());
		}
	}
}
