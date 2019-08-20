package designpatterns.TemplateMethod;

public class ConcreteB extends AlgorithmToDefine{

	@Override
	protected void method2() {
		System.out.println("ho ridefinito il metodo 2 di B");
		
	}

	@Override
	protected String method1() {
		return "ho ridefinito il metodo1 di B";
	}

}
