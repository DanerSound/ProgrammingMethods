package antiPatternsBase;

public class Base {

	public Boolean testValue;

	public Base(Boolean testValue) {
		this.testValue = testValue;
	}

	public Boolean operation1() {
		return testValue = operation2();

	}

	public Boolean operation2() {
		return testValue=false;
	}

}
