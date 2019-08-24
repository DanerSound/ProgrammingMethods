package designpatterns.TemplateMethod;

public abstract class AlgorithmToDefine {

	public void templateMethod() {

		System.out.println(" this method can call" + method1());
		method2();

	}

	protected abstract void method2();

	protected abstract String method1();

}
