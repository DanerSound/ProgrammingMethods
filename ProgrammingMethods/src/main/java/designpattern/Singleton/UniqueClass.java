package designpattern.Singleton;

public class UniqueClass {
	private static UniqueClass instance;

	private UniqueClass() {}

	public static UniqueClass getInstance() {
		if (instance == null) {
			instance = new UniqueClass();
		}
		return instance;
	}

	void showMessagge() {
		System.out.println(this.getClass());
	}

}
