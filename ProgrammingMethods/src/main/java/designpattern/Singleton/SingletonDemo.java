package designpattern.Singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		UniqueClass Elvis = UniqueClass.getInstance();
		
		Elvis.showMessagge();
		
		SingleObject lp = SingleObject.getIntance();
		lp.op();

	}

}
