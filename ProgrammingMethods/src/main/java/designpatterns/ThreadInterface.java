package designpatterns;

import java.util.ArrayList;

public abstract class ThreadInterface {
	
	public ArrayList<ThreadObserver> observers=new ArrayList<ThreadObserver>();

	public abstract void addObverser(ThreadObserver obs);
	
	public abstract void removeObser(ThreadObserver obs);
	
	public abstract void notifica();
}
