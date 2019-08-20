package designpattern.Singleton;

public class SingleObject {
	
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getIntance() {
		return instance;
	}
	
	public void op() {
		System.out.println(" other singleton version");
	}
}
