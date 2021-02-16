package antiPatternsBase;

public class Extended extends Base {

	public Extended(Boolean testValue) {
		super(testValue);	
	}
	public boolean Operation2() {
		if(testValue==true) {
			return testValue=false;
		}else {
			return testValue=true;
		}
	}
}
