package fragileBase;

public class BaseClass {
	
	private String name="Base";
	
	public void printClassName() {
		System.out.println(" The base class name is "+getClassName());	
	}
	
	public String getClassName() {
		return name;
	}

}
