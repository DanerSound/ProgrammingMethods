package designpattern.TemplateMethod;

public class ConcreteA extends AlgorithmToDefine {
	
	@Override
	protected void method2() {
		System.out.println(" ho ridefinito il metodo 2 di A");
		
	}

	@Override
	protected String method1() {
		String myString =" ho ridefinito il metodo1 di A";
		return myString;
	}

}
