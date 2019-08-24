package designpatterns.TemplateMethod;

public class MainTest {

	public static void main(String[] args) {
		ConcreteA myA= new ConcreteA();
		
		myA.templateMethod();
		
		ConcreteB myB = new ConcreteB();
		
		myB.templateMethod();
	}

}
